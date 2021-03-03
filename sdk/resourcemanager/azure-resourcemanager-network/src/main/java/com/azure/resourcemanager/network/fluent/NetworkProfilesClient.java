// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkProfilesClient. */
public interface NetworkProfilesClient
    extends InnerSupportsGet<NetworkProfileInner>,
        InnerSupportsListing<NetworkProfileInner>,
        InnerSupportsDelete<Void> {
    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String networkProfileName);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkProfileName);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkProfileName);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkProfileName, Context context);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkProfileName);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkProfileName);

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkProfileName, Context context);

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkProfileInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String networkProfileName, String expand);

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkProfileInner> getByResourceGroupAsync(
        String resourceGroupName, String networkProfileName, String expand);

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkProfileInner> getByResourceGroupAsync(String resourceGroupName, String networkProfileName);

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkProfileInner getByResourceGroup(String resourceGroupName, String networkProfileName);

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkProfileInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkProfileName, String expand, Context context);

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Parameters supplied to the create or update network profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkProfileInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String networkProfileName, NetworkProfileInner parameters);

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Parameters supplied to the create or update network profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkProfileInner> createOrUpdateAsync(
        String resourceGroupName, String networkProfileName, NetworkProfileInner parameters);

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Parameters supplied to the create or update network profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkProfileInner createOrUpdate(
        String resourceGroupName, String networkProfileName, NetworkProfileInner parameters);

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Parameters supplied to the create or update network profile operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkProfileInner> createOrUpdateWithResponse(
        String resourceGroupName, String networkProfileName, NetworkProfileInner parameters, Context context);

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkProfileInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String networkProfileName, Map<String, String> tags);

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkProfileInner> updateTagsAsync(
        String resourceGroupName, String networkProfileName, Map<String, String> tags);

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkProfileInner> updateTagsAsync(String resourceGroupName, String networkProfileName);

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkProfileInner updateTags(String resourceGroupName, String networkProfileName);

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkProfileInner> updateTagsWithResponse(
        String resourceGroupName, String networkProfileName, Map<String, String> tags, Context context);

    /**
     * Gets all the network profiles in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkProfileInner> listAsync();

    /**
     * Gets all the network profiles in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkProfileInner> list();

    /**
     * Gets all the network profiles in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkProfileInner> list(Context context);

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkProfileInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkProfileInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkProfileInner> listByResourceGroup(String resourceGroupName, Context context);
}
