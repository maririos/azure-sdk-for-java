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
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation.SqlVirtualMachineGroupInner;

/**
 * Type representing SqlVirtualMachineGroup.
 */
public interface SqlVirtualMachineGroup extends HasInner<SqlVirtualMachineGroupInner>, Resource, GroupableResourceCore<SqlVirtualMachineManager, SqlVirtualMachineGroupInner>, HasResourceGroup, Refreshable<SqlVirtualMachineGroup>, Updatable<SqlVirtualMachineGroup.Update>, HasManager<SqlVirtualMachineManager> {
    /**
     * @return the clusterConfiguration value.
     */
    ClusterConfiguration clusterConfiguration();

    /**
     * @return the clusterManagerType value.
     */
    ClusterManagerType clusterManagerType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the scaleType value.
     */
    ScaleType scaleType();

    /**
     * @return the sqlImageOffer value.
     */
    String sqlImageOffer();

    /**
     * @return the sqlImageSku value.
     */
    SqlVmGroupImageSku sqlImageSku();

    /**
     * @return the wsfcDomainProfile value.
     */
    WsfcDomainProfile wsfcDomainProfile();

    /**
     * The entirety of the SqlVirtualMachineGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlVirtualMachineGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlVirtualMachineGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SqlVirtualMachineGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sqlvirtualmachinegroup definition allowing to specify SqlImageOffer.
         */
        interface WithSqlImageOffer {
            /**
             * Specifies sqlImageOffer.
             * @param sqlImageOffer SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016
             * @return the next definition stage
             */
            WithCreate withSqlImageOffer(String sqlImageOffer);
        }

        /**
         * The stage of the sqlvirtualmachinegroup definition allowing to specify SqlImageSku.
         */
        interface WithSqlImageSku {
            /**
             * Specifies sqlImageSku.
             * @param sqlImageSku SQL image sku. Possible values include: 'Developer', 'Enterprise'
             * @return the next definition stage
             */
            WithCreate withSqlImageSku(SqlVmGroupImageSku sqlImageSku);
        }

        /**
         * The stage of the sqlvirtualmachinegroup definition allowing to specify WsfcDomainProfile.
         */
        interface WithWsfcDomainProfile {
            /**
             * Specifies wsfcDomainProfile.
             * @param wsfcDomainProfile Cluster Active Directory domain profile
             * @return the next definition stage
             */
            WithCreate withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SqlVirtualMachineGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSqlImageOffer, DefinitionStages.WithSqlImageSku, DefinitionStages.WithWsfcDomainProfile {
        }
    }
    /**
     * The template for a SqlVirtualMachineGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlVirtualMachineGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithSqlImageOffer, UpdateStages.WithSqlImageSku, UpdateStages.WithWsfcDomainProfile {
    }

    /**
     * Grouping of SqlVirtualMachineGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sqlvirtualmachinegroup update allowing to specify SqlImageOffer.
         */
        interface WithSqlImageOffer {
            /**
             * Specifies sqlImageOffer.
             * @param sqlImageOffer SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016
             * @return the next update stage
             */
            Update withSqlImageOffer(String sqlImageOffer);
        }

        /**
         * The stage of the sqlvirtualmachinegroup update allowing to specify SqlImageSku.
         */
        interface WithSqlImageSku {
            /**
             * Specifies sqlImageSku.
             * @param sqlImageSku SQL image sku. Possible values include: 'Developer', 'Enterprise'
             * @return the next update stage
             */
            Update withSqlImageSku(SqlVmGroupImageSku sqlImageSku);
        }

        /**
         * The stage of the sqlvirtualmachinegroup update allowing to specify WsfcDomainProfile.
         */
        interface WithWsfcDomainProfile {
            /**
             * Specifies wsfcDomainProfile.
             * @param wsfcDomainProfile Cluster Active Directory domain profile
             * @return the next update stage
             */
            Update withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile);
        }

    }
}
