# Guide for migrating to azure-messaging-servicebus

This guide assists in the migration to version 7 of the Service Bus client library
[`com.azure:azure-messaging-servicebus`](https://search.maven.org/artifact/com.azure/azure-messaging-servicebus) from
version 3 of
[`com.microsoft.azure:azure-servicebus`](https://search.maven.org/artifact/com.microsoft.azure/azure-servicebus/). It
will focus on side-by-side comparisons for similar operations between the two packages.

Familiarity with the `com.microsoft.azure:azure-servicebus` library is assumed. For those new to the Service Bus client
library for Java, please refer to the
[README](https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/servicebus/azure-messaging-servicebus/README.md)
and [Service Bus
samples](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/servicebus/azure-messaging-servicebus/src/samples/java/com/azure/messaging/servicebus)
for the `azure-messaging-servicebus` library rather than this guide.

## Table of contents

- [Guide for migrating to azure-messaging-servicebus](#guide-for-migrating-to-azure-messaging-servicebus)
  - [Table of contents](#table-of-contents)
  - [Migration benefits](#migration-benefits)
  - [General changes](#general-changes)
    - [Group id, artifact id, and package names](#group-id-artifact-id-and-package-names)
    - [Client hierarchy](#client-hierarchy)
    - [Async programming model](#async-programming-model)
    - [Connection Pooling](#connection-pooling)
  - [Migration Samples](#migration-samples)
    - [Instantiating clients](#instantiating-clients)
    - [Sending messages](#sending-messages)
    - [Receiving messages](#receiving-messages)
    - [Working with sessions](#working-with-sessions)
  - [Additional samples](#additional-samples)

## Migration benefits

A natural question to ask when considering whether or not to adopt a new version or library is what the benefits of
doing so would be. As Azure has matured and been embraced by a more diverse group of developers, we have been focused on
learning the patterns and practices to best support developer productivity and to understand the gaps that the Java
client libraries have.

There were several areas of consistent feedback expressed across the Azure client library ecosystem. One of the most
important is that the client libraries for different Azure services have not had a consistent approach to organization,
naming, and API structure. Additionally, many developers have felt that the learning curve was difficult, and the APIs
did not offer a good, approachable, and consistent onboarding story for those learning Azure or exploring a specific
Azure service.

To improve the development experience across Azure services, including Service Bus, a set of uniform [design
guidelines](https://azure.github.io/azure-sdk/general_introduction.html) was created for all languages to drive a
consistent experience with established API patterns for all services. A set of [Java specific
guidelines](https://azure.github.io/azure-sdk/java_introduction.html) was also introduced to ensure that Java clients
have a natural and idiomatic feel that mirrors that of Java developers. Further details are available in the guidelines
for those interested.

The new Service Bus library `azure-messaging-servicebus` provides the ability to share in some of the cross-service
improvements made to the Azure development experience, such as using the new `azure-identity` library to share a single
authentication between clients and a unified diagnostics pipeline offering a common view of the activities across each
of the client libraries.

While we believe that there is significant benefit to adopting the new Service Bus library `azure-messaging-servicebus`,
it is important to be aware that the previous version `azure-servicebus` have not been officially deprecated. They will
continue to be supported with security and bug fixes as well as receiving some minor refinements. However, in the near
future they will not be under active development and new features are unlikely to be added to them.

## General changes

### Group id, artifact id, and package names

Artifact and package names for the modern Azure client libraries for Java have changed. Legacy clients have the
`com.microsoft.azure` group id where-as, the new clients use `com.azure`. In addition, each will follow the artifact id
pattern `azure-[area].[service]` where the legacy clients followed the pattern `azure-[service]`. This provides a quick
and accessible means to help understand, at a glance, whether you are using the modern or legacy clients.

In the case of Service Bus, the new client libraries have packages and namespaces that begin with
`com.azure.messaging.servicebus` and were released beginning with version 7. The legacy client libraries have packages
and namespaces that begin with `com.microsoft.azure.servicebus` and a version of 3.x.x or below.

### Client hierarchy

As part of the new Java SDK guidelines, all clients are instantiated from a builder which is the single entry point to the library.
Each client is expected to have a sync and async version that can be instantiated via `buildAsyncClient()` or `buildClient()` methods
on the builder.

In the new Service Bus library, this single entry point is the `ServiceBusClientBuilder` which can be used to create sender and receiver
clients to the queue/topic/subscription/session of your choice and start sending/receiving messages.

### Async programming model

Usage of `CompletableFuture` for async operations is replaced with a different programming model that uses [Project Reactor](https://projectreactor.io).
This is a shift to thinking about data as a Stream of information.

Project Reactor has many bridge APIs to quickly migrate code using `CompletableFuture`. A few examples are:
* [Mono.fromFuture(CompletableFuture<T>)](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html#fromFuture-java.util.concurrent.CompletableFuture-)
* [Mono.fromCompletionStage(CompletionStage<T> completionStage)](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html#fromCompletionStage-java.util.concurrent.CompletionStage-)
* For more: [Mono](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html)

### Connection Pooling

By using a single top-level client builder, we can implicitly share a single AMQP connection for all operations that an
application performs. In the previous library `azure-servicebus`, connection sharing was explicit. You had to pass in a
`MessagingFactory` object  to share a connection.

By making this connection sharing be implicit to a `ServiceBusClientBuilder` instance, we can help ensure that
applications will not use multiple connections unless they explicitly opt in by creating multiple client builder
instances.

## Migration Samples

### Instantiating clients

While we continue to support connection strings when constructing a client, the main difference is when using Azure
Active Directory. We now use the new [azure-identity](https://search.maven.org/artifact/com.azure/azure-identity)
library to share a single authentication solution between clients of different Azure services.

```java
// Create a sender client that will authenticate through Active Directory
TokenCredential credential = new DefaultAzureCredentialBuilder()
    .build();
String fullyQualifiedNamespace = "yournamespace.servicebus.windows.net";
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .credential(fullyQualifiedNamespace, credential)
    .sender()
    .queueName("my-queue")
    .buildClient();

// Create a sender client that will authenticate using a connection string
String connectionString = "Endpoint=sb://yournamespace.servicebus.windows.net/;SharedAccessKeyName=your-key-name;SharedAccessKey=your-key";
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sender()
    .queueName("my-queue")
    .buildClient();
```

### Sending messages

Previously, in `azure-servicebus`, you could send messages either by using a `IQueueClient` (or `ITopicClient` if you
are targeting a topic) or the `IMessageSender`.

While the `IQueueClient` supported the simple send operation, the `IMessageSender` supported that and advanced scenarios
like scheduling to send messages at a later time and cancelling such scheduled messages.

```java
String queueName = "my-queue";
String connectionString = "Endpoint=sb://yournamespace.servicebus.windows.net/;"
    + "SharedAccessKeyName=your-key-name;SharedAccessKey=your-key";

// create a message to send
Message message = new Message("content");

// send using the QueueClient
QueueClient client = new QueueClient(new ConnectionStringBuilder(connectionString, queueName),
    ReceiveMode.PEEKLOCK);
client.send(message);

// send using the IMessageSender
IMessageSender sender = ClientFactory.createMessageSenderFromConnectionStringBuilder(
    new ConnectionStringBuilder(connectionString, queueName));
sender.send(message);
```

Now in `azure-messaging-servicebus`, we combine all send related features under a common class `ServiceBusSenderClient`
and its async counterpart `ServiceBusSenderAsyncClient`. You can create these from the top-level client builder using the `sender()` method to
get a sub-builder. The sub builder takes the queue or topic you want to target. This way, we give you a one stop shop for
all your send related needs.

We continue to support sending bytes in the message. Though, if you are working with strings, you can now create a
message directly without having to convert it to bytes first. The snippet below demonstrates the sync sender client.

```java
// create the sync sender via the builder and its sub-builder
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sender()
    .queueName("my-queue")
    .buildClient();

// create a message to send
ServiceBusMessage message = new ServiceBusMessage("Hello world!");

// send the message
sender.sendMessage(message);
```

The feature to send a list of messages in a single call was previously implemented by batching all the messages into a single AMQP
message and sending that to the service.

While we continue to support this feature, it always had the potential to fail unexpectedly when the resulting batched
AMQP message exceeded the size limit of the sender. To help with this, we now provide a safe way to batch multiple
messages to be sent at once using the new `ServiceBusMessageBatch` class.

In the below code snippet, `inputMessageArray` is an array of messages which we will loop over to safely batch and then
send. This uses the sync sender as well.

```java
// create the sync sender via the builder and its sub-builder
ServiceBusSenderClient client = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sender()
    .queueName("my-queue")
    .buildClient();

ServiceBusMessage[] inputMessageArray = new ServiceBusMessage[10];
ServiceBusMessageBatch messageBatch = sender.createBatch();

for (int i = 0; i < inputMessageArray.length; i++) {
    if (!messageBatch.tryAdd(inputMessageArray[i])) {
        if (messageBatch.getCount() == 0) {
            System.err.println("Failed to fit message number in a batch. i:" + i);
            break;
        }

        // Decrement counter so that message number i can get another chance in a new batch
        i--;

        // send the message batch and create a new batch
        sender.sendMessages(messageBatch);
        messageBatch = sender.createBatch();
    }
}

// send the final batch
if (messageBatch.getCount() > 0) {
    sender.sendMessages(messageBatch);
}
```

### Receiving messages

Previously, in `azure-servicebus`, you could receive messages either by using a `IQueueClient` (or `ISubscriptionClient`
if you are targeting a subscription) or the `IMessageReceiver`.

While the `IQueueClient` and supported the simple push model where you could register message and error
handlers/callbacks, the `IMessageReceiver` provided you with ways to receive messages (both normal and deferred) in
batches, settle messages and renew locks.

```java
QueueClient client = new QueueClient(new ConnectionStringBuilder(connectionString, queueName),
    ReceiveMode.PEEKLOCK);

int maxConcurrentCalls = 3;
boolean isAutoComplete = false;
Duration maxAutoRenewDuration = Duration.ofMinutes(5);
Duration maxMessageWaitDuration = Duration.ofSeconds(10);
MessageHandlerOptions options = new MessageHandlerOptions(maxConcurrentCalls, isAutoComplete,
    maxAutoRenewDuration, maxMessageWaitDuration);
ExecutorService executor = Executors.newWorkStealingPool(maxConcurrentCalls);

try {
    client.registerMessageHandler(new IMessageHandler() {
        @Override
        public CompletableFuture<Void> onMessageAsync(IMessage message) {
            MessageBody messageBody = message.getMessageBody();
            List<byte[]> binary = messageBody.getBinaryData();
            byte[] bytes = binary.get(0);
            System.out.printf("Received message with Binary body: %s%n",
                new String(bytes));

            return client.completeAsync(message.getLockToken());
        }

        @Override
        public void notifyException(Throwable exception, ExceptionPhase phase) {
            System.err.printf("Message handler encountered an exception. %s Phase: %s%n",
                exception, phase);
        }
    }, options, executor);
} finally {
    executor.shutdown();
}
```

The new Java SDK provides a dedicated processor client to which you can pass your message and error handlers.
Like the older SDK, this supports auto completion of messages and automatica renewal of message/session locks.

For a more fine grained control and advanced features, you still have the `ServiceBusReceiverClient` and it's async 
counterpart `ServiceBusReceiverAsyncClient`.

```java

// Sample code that processes a single message
Consumer<ServiceBusReceivedMessageContext> processMessage = messageContext -> {
    try {
        System.out.println(messageContext.getMessage().getMessageId());
        // other message processing code
        messageContext.complete(); 
    } catch (Exception ex) {
        messageContext.abandon(); 
    }
}   

// Sample code that gets called if there's an error
Consumer<Throwable> processError = throwable -> {
    logError(throwable);
    metrics.recordError(throwable);
}

// create the processor client via the builder and its sub-builder
ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                                .connectionString("connection-string")
                                .processor()
                                .queueName("queue-name")
                                .processMessage(processMessage)
                                .processError(processError)
                                .buildProcessorClient();

// Starts the processor in the background and returns immediately
processorClient.start();

```

### Working with sessions

Previously, you had the below options to receive messages from a session enabled queue/subscription
- Register message and error handlers using the `QueueClient.registerSessionHandler()` method to receive messages from
  multiple sessions as controlled by the `maxConcurrentSessions` option.
- Use the `ClientFactory.acceptMessageSessionAsync()` method to get an instance of the `IMessageSession` class that will be tied to a given sessionId or to the next available session if no sessionId is provided.

Now, we simplify this by giving session variants of the same methods and classes that are available when working with
queues/subscriptions that do not have sessions enabled. 

To get the session counterpart of the processor client described in the previous section, you would use the `sessionProcessor()` on the builder to get the session variant of the sub builder for the processor client.

The below code snippet shows you how to use the processor client to receive messages from at most three different sessions at a given point.

```java
// Sample code that processes a single message
Consumer<ServiceBusReceivedMessageContext> processMessage = messageContext -> {
    try {
        System.out.println(messageContext.getMessage().getMessageId());
        // other message processing code
        messageContext.complete(); 
    } catch (Exception ex) {
        messageContext.abandon(); 
    }
}   

// Sample code that gets called if there's an error
Consumer<Throwable> processError = throwable -> {
    logError(throwable);
    metrics.recordError(throwable);
}

// create the processor client via the builder and its sub-builder
ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                                .connectionString("connection-string")
                                .processor()
                                .queueName("queue-name")
                                .maxConcurrentSessions(3)
                                .processMessage(processMessage)
                                .processError(processError)
                                .buildProcessorClient();

processorClient.start();
```

For a more fine grained control and advanced features, you still have the `ServiceBusReceiverClient` and it's async 
counterpart `ServiceBusReceiverAsyncClient` which are tied to a single session. To get the such receiver clients, you 
would use the `sessionReceiver()` on the builder to get an intermediate `ServiceBusSessionReceiverClient`/`ServiceBusSessionReceiverAsyncClient` 
which acts like a factory for you to get receiver clients for individual sessions. 

Please note that getting such a receiver client is an async operation because the library will need to get a lock on the session by connecting to the service first.

While the below code uses `acceptSession()` that takes a sessionId, you can also use `acceptNextSession()` that will result in the service attempting to get a lock on the next available session for you.

```java
ServiceBusSessionReceiverClient sessionClient = new ServiceBusClientBuilder()
    .connectionString(connectionString)
    .sessionReceiver()
    .queueName("queue")
    .buildClient();

ServiceBusReceiverClient receiverClient = sessionClient.acceptSession("my-session-id");
```

## Additional samples

More examples can be found at:
- [Service Bus samples](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/servicebus/azure-messaging-servicebus/src/samples/java/com/azure/messaging/servicebus)
