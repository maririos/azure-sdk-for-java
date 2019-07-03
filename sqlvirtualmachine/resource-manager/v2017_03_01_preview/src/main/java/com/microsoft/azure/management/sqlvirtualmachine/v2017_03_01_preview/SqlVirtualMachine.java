/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation.SqlVirtualMachineManager;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation.SqlVirtualMachineInner;

/**
 * Type representing SqlVirtualMachine.
 */
public interface SqlVirtualMachine extends HasInner<SqlVirtualMachineInner>, Resource, GroupableResourceCore<SqlVirtualMachineManager, SqlVirtualMachineInner>, HasResourceGroup, Refreshable<SqlVirtualMachine>, Updatable<SqlVirtualMachine.Update>, HasManager<SqlVirtualMachineManager> {
    /**
     * @return the autoBackupSettings value.
     */
    AutoBackupSettings autoBackupSettings();

    /**
     * @return the autoPatchingSettings value.
     */
    AutoPatchingSettings autoPatchingSettings();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the keyVaultCredentialSettings value.
     */
    KeyVaultCredentialSettings keyVaultCredentialSettings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serverConfigurationsManagementSettings value.
     */
    ServerConfigurationsManagementSettings serverConfigurationsManagementSettings();

    /**
     * @return the sqlImageOffer value.
     */
    String sqlImageOffer();

    /**
     * @return the sqlImageSku value.
     */
    SqlImageSku sqlImageSku();

    /**
     * @return the sqlManagement value.
     */
    SqlManagementMode sqlManagement();

    /**
     * @return the sqlServerLicenseType value.
     */
    SqlServerLicenseType sqlServerLicenseType();

    /**
     * @return the sqlVirtualMachineGroupResourceId value.
     */
    String sqlVirtualMachineGroupResourceId();

    /**
     * @return the virtualMachineResourceId value.
     */
    String virtualMachineResourceId();

    /**
     * @return the wsfcDomainCredentials value.
     */
    WsfcDomainCredentials wsfcDomainCredentials();

    /**
     * The entirety of the SqlVirtualMachine definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlVirtualMachine definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlVirtualMachine definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SqlVirtualMachine definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify AutoBackupSettings.
         */
        interface WithAutoBackupSettings {
            /**
             * Specifies autoBackupSettings.
             * @param autoBackupSettings Auto backup settings for SQL Server
             * @return the next definition stage
             */
            WithCreate withAutoBackupSettings(AutoBackupSettings autoBackupSettings);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify AutoPatchingSettings.
         */
        interface WithAutoPatchingSettings {
            /**
             * Specifies autoPatchingSettings.
             * @param autoPatchingSettings Auto patching settings for applying critical security updates to SQL virtual machine
             * @return the next definition stage
             */
            WithCreate withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Azure Active Directory identity of the server
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify KeyVaultCredentialSettings.
         */
        interface WithKeyVaultCredentialSettings {
            /**
             * Specifies keyVaultCredentialSettings.
             * @param keyVaultCredentialSettings Key vault credential settings
             * @return the next definition stage
             */
            WithCreate withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify ServerConfigurationsManagementSettings.
         */
        interface WithServerConfigurationsManagementSettings {
            /**
             * Specifies serverConfigurationsManagementSettings.
             * @param serverConfigurationsManagementSettings SQL Server configuration management settings
             * @return the next definition stage
             */
            WithCreate withServerConfigurationsManagementSettings(ServerConfigurationsManagementSettings serverConfigurationsManagementSettings);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify SqlImageOffer.
         */
        interface WithSqlImageOffer {
            /**
             * Specifies sqlImageOffer.
             * @param sqlImageOffer SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016
             * @return the next definition stage
             */
            WithCreate withSqlImageOffer(String sqlImageOffer);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify SqlImageSku.
         */
        interface WithSqlImageSku {
            /**
             * Specifies sqlImageSku.
             * @param sqlImageSku SQL Server edition type. Possible values include: 'Developer', 'Express', 'Standard', 'Enterprise', 'Web'
             * @return the next definition stage
             */
            WithCreate withSqlImageSku(SqlImageSku sqlImageSku);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify SqlManagement.
         */
        interface WithSqlManagement {
            /**
             * Specifies sqlManagement.
             * @param sqlManagement SQL Server Management type. Possible values include: 'Full', 'LightWeight', 'NoAgent'
             * @return the next definition stage
             */
            WithCreate withSqlManagement(SqlManagementMode sqlManagement);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify SqlServerLicenseType.
         */
        interface WithSqlServerLicenseType {
            /**
             * Specifies sqlServerLicenseType.
             * @param sqlServerLicenseType SQL Server license type. Possible values include: 'PAYG', 'AHUB'
             * @return the next definition stage
             */
            WithCreate withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify SqlVirtualMachineGroupResourceId.
         */
        interface WithSqlVirtualMachineGroupResourceId {
            /**
             * Specifies sqlVirtualMachineGroupResourceId.
             * @param sqlVirtualMachineGroupResourceId ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of
             * @return the next definition stage
             */
            WithCreate withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify VirtualMachineResourceId.
         */
        interface WithVirtualMachineResourceId {
            /**
             * Specifies virtualMachineResourceId.
             * @param virtualMachineResourceId ARM Resource id of underlying virtual machine created from SQL marketplace image
             * @return the next definition stage
             */
            WithCreate withVirtualMachineResourceId(String virtualMachineResourceId);
        }

        /**
         * The stage of the sqlvirtualmachine definition allowing to specify WsfcDomainCredentials.
         */
        interface WithWsfcDomainCredentials {
            /**
             * Specifies wsfcDomainCredentials.
             * @param wsfcDomainCredentials Domain credentials for setting up Windows Server Failover Cluster for SQL availability group
             * @return the next definition stage
             */
            WithCreate withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SqlVirtualMachine>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAutoBackupSettings, DefinitionStages.WithAutoPatchingSettings, DefinitionStages.WithIdentity, DefinitionStages.WithKeyVaultCredentialSettings, DefinitionStages.WithServerConfigurationsManagementSettings, DefinitionStages.WithSqlImageOffer, DefinitionStages.WithSqlImageSku, DefinitionStages.WithSqlManagement, DefinitionStages.WithSqlServerLicenseType, DefinitionStages.WithSqlVirtualMachineGroupResourceId, DefinitionStages.WithVirtualMachineResourceId, DefinitionStages.WithWsfcDomainCredentials {
        }
    }
    /**
     * The template for a SqlVirtualMachine update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlVirtualMachine>, Resource.UpdateWithTags<Update>, UpdateStages.WithAutoBackupSettings, UpdateStages.WithAutoPatchingSettings, UpdateStages.WithIdentity, UpdateStages.WithKeyVaultCredentialSettings, UpdateStages.WithServerConfigurationsManagementSettings, UpdateStages.WithSqlImageOffer, UpdateStages.WithSqlImageSku, UpdateStages.WithSqlManagement, UpdateStages.WithSqlServerLicenseType, UpdateStages.WithSqlVirtualMachineGroupResourceId, UpdateStages.WithVirtualMachineResourceId, UpdateStages.WithWsfcDomainCredentials {
    }

    /**
     * Grouping of SqlVirtualMachine update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sqlvirtualmachine update allowing to specify AutoBackupSettings.
         */
        interface WithAutoBackupSettings {
            /**
             * Specifies autoBackupSettings.
             * @param autoBackupSettings Auto backup settings for SQL Server
             * @return the next update stage
             */
            Update withAutoBackupSettings(AutoBackupSettings autoBackupSettings);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify AutoPatchingSettings.
         */
        interface WithAutoPatchingSettings {
            /**
             * Specifies autoPatchingSettings.
             * @param autoPatchingSettings Auto patching settings for applying critical security updates to SQL virtual machine
             * @return the next update stage
             */
            Update withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Azure Active Directory identity of the server
             * @return the next update stage
             */
            Update withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify KeyVaultCredentialSettings.
         */
        interface WithKeyVaultCredentialSettings {
            /**
             * Specifies keyVaultCredentialSettings.
             * @param keyVaultCredentialSettings Key vault credential settings
             * @return the next update stage
             */
            Update withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify ServerConfigurationsManagementSettings.
         */
        interface WithServerConfigurationsManagementSettings {
            /**
             * Specifies serverConfigurationsManagementSettings.
             * @param serverConfigurationsManagementSettings SQL Server configuration management settings
             * @return the next update stage
             */
            Update withServerConfigurationsManagementSettings(ServerConfigurationsManagementSettings serverConfigurationsManagementSettings);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify SqlImageOffer.
         */
        interface WithSqlImageOffer {
            /**
             * Specifies sqlImageOffer.
             * @param sqlImageOffer SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016
             * @return the next update stage
             */
            Update withSqlImageOffer(String sqlImageOffer);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify SqlImageSku.
         */
        interface WithSqlImageSku {
            /**
             * Specifies sqlImageSku.
             * @param sqlImageSku SQL Server edition type. Possible values include: 'Developer', 'Express', 'Standard', 'Enterprise', 'Web'
             * @return the next update stage
             */
            Update withSqlImageSku(SqlImageSku sqlImageSku);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify SqlManagement.
         */
        interface WithSqlManagement {
            /**
             * Specifies sqlManagement.
             * @param sqlManagement SQL Server Management type. Possible values include: 'Full', 'LightWeight', 'NoAgent'
             * @return the next update stage
             */
            Update withSqlManagement(SqlManagementMode sqlManagement);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify SqlServerLicenseType.
         */
        interface WithSqlServerLicenseType {
            /**
             * Specifies sqlServerLicenseType.
             * @param sqlServerLicenseType SQL Server license type. Possible values include: 'PAYG', 'AHUB'
             * @return the next update stage
             */
            Update withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify SqlVirtualMachineGroupResourceId.
         */
        interface WithSqlVirtualMachineGroupResourceId {
            /**
             * Specifies sqlVirtualMachineGroupResourceId.
             * @param sqlVirtualMachineGroupResourceId ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of
             * @return the next update stage
             */
            Update withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify VirtualMachineResourceId.
         */
        interface WithVirtualMachineResourceId {
            /**
             * Specifies virtualMachineResourceId.
             * @param virtualMachineResourceId ARM Resource id of underlying virtual machine created from SQL marketplace image
             * @return the next update stage
             */
            Update withVirtualMachineResourceId(String virtualMachineResourceId);
        }

        /**
         * The stage of the sqlvirtualmachine update allowing to specify WsfcDomainCredentials.
         */
        interface WithWsfcDomainCredentials {
            /**
             * Specifies wsfcDomainCredentials.
             * @param wsfcDomainCredentials Domain credentials for setting up Windows Server Failover Cluster for SQL availability group
             * @return the next update stage
             */
            Update withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials);
        }

    }
}
