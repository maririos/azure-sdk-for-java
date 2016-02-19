# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Serializer, Deserializer
from msrestazure import AzureConfiguration
from .operations.head_exception_operations import HeadExceptionOperations


class AutoRestHeadExceptionTestServiceConfiguration(AzureConfiguration):
    """Configuration for AutoRestHeadExceptionTestService
    Note that all parameters used to create this instance are saved as instance
    attributes.

    :param credentials: Gets Azure subscription credentials.
    :type credentials: credentials
    :param accept_language: Gets or sets the preferred language for the
     response.
    :type accept_language: str
    :param long_running_operation_retry_timeout: Gets or sets the retry
     timeout in seconds for Long Running Operations. Default value is 30.
    :type long_running_operation_retry_timeout: int
    :param generate_client_request_id: When set to true a unique
     x-ms-client-request-id value is generated and included in each request.
     Default is true.
    :type generate_client_request_id: bool
    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, credentials, accept_language='en-US', long_running_operation_retry_timeout=30, generate_client_request_id=True, base_url=None, filepath=None):

        if credentials is None:
            raise ValueError('credentials must not be None.')
        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestHeadExceptionTestServiceConfiguration, self).__init__(base_url, filepath)

        self.add_user_agent('autorestheadexceptiontestservice/1.0.0')

        self.credentials = credentials
        self.accept_language = accept_language
        self.long_running_operation_retry_timeout = long_running_operation_retry_timeout
        self.generate_client_request_id = generate_client_request_id


class AutoRestHeadExceptionTestService(object):
    """Test Infrastructure for AutoRest

    :param config: Configuration for client.
    :type config: AutoRestHeadExceptionTestServiceConfiguration

    :ivar head_exception: HeadException operations
    :vartype head_exception: .operations.HeadExceptionOperations
    """

    def __init__(self, config):

        self._client = ServiceClient(config.credentials, config)

        client_models = {}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.head_exception = HeadExceptionOperations(
            self._client, self.config, self._serialize, self._deserialize)
