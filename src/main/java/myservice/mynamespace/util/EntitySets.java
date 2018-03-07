////////////////////////////////////////////////////////////////////////////////
//
// Created by BBruhns on 04.03.2018.
//
// Copyright (c) 2006 - 2018 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////

package myservice.mynamespace.util;

import org.apache.olingo.commons.api.edm.provider.CsdlEntitySet;
import org.apache.olingo.commons.api.edm.provider.CsdlNavigationPropertyBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static myservice.mynamespace.util.EntityNames.ES_SAPLANE_NAME;
import static myservice.mynamespace.util.EntityNames.ES_SBOOK_NAME;
import static myservice.mynamespace.util.EntityNames.ES_SCARR_NAME;
import static myservice.mynamespace.util.EntityNames.ES_SFLIGHT_NAME;
import static myservice.mynamespace.util.EntityNames.ES_SPFLI_NAME;
import static myservice.mynamespace.util.EntityNames.ET_SAPLANE_FQN;
import static myservice.mynamespace.util.EntityNames.ET_SBOOK_FQN;
import static myservice.mynamespace.util.EntityNames.ET_SCARR_FQN;
import static myservice.mynamespace.util.EntityNames.ET_SFLIGHT_FQN;
import static myservice.mynamespace.util.EntityNames.ET_SPFLI_FQN;

/**
 *
 */
public class EntitySets {

    // ------------------------------------------------------------------------
    // constants
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    public static CsdlEntitySet getFlightsEntitySet() {//TODO abändern
        final CsdlEntitySet entitySet;
        entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SFLIGHT_NAME);
        entitySet.setType(ET_SFLIGHT_FQN);

        // navigation
        final CsdlNavigationPropertyBinding navBindingToCarriers = new CsdlNavigationPropertyBinding();
        navBindingToCarriers.setTarget(ES_SCARR_NAME);//das kann Einzahl TODO EINZAHL?
        navBindingToCarriers.setPath(ES_SCARR_NAME);//und das whs. immer Mehrzahl --> dann one-to-many?

        final CsdlNavigationPropertyBinding navBindingToConnections = new CsdlNavigationPropertyBinding();
        navBindingToConnections.setTarget(ES_SPFLI_NAME);
        navBindingToConnections.setPath(ES_SPFLI_NAME);

        final CsdlNavigationPropertyBinding navBindingToPlanes = new CsdlNavigationPropertyBinding();
        navBindingToConnections.setTarget(ES_SPFLI_NAME);
        navBindingToConnections.setPath(ES_SPFLI_NAME);

        final CsdlNavigationPropertyBinding navBindingToBookings = new CsdlNavigationPropertyBinding();
        navBindingToConnections.setTarget(ES_SPFLI_NAME);
        navBindingToConnections.setPath(ES_SPFLI_NAME);

        final List<CsdlNavigationPropertyBinding> navPropBindingList = new ArrayList<>(Arrays.asList(navBindingToCarriers,
                                                                                                     navBindingToConnections,
                                                                                                     navBindingToPlanes,
                                                                                                     navBindingToBookings));
        entitySet.setNavigationPropertyBindings(navPropBindingList);
        return entitySet;
    }

    public static CsdlEntitySet getConnectionsEntitySet() {//TODO abändern
        final CsdlEntitySet entitySet;
        entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SPFLI_NAME);
        entitySet.setType(ET_SPFLI_FQN);

        // navigation
        final CsdlNavigationPropertyBinding navPropBinding = new CsdlNavigationPropertyBinding();
        navPropBinding.setTarget("Products"); // the target entity set, where the navigation property points to
        navPropBinding.setPath("Products"); // the path from entity type to navigation property
        final List<CsdlNavigationPropertyBinding> navPropBindingList = new ArrayList<>(Collections.singletonList(navPropBinding));
        entitySet.setNavigationPropertyBindings(navPropBindingList);
        return entitySet;
    }

    public static CsdlEntitySet getCarrierEntitySet() {
        final CsdlEntitySet entitySet;
        entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SCARR_NAME);
        entitySet.setType(ET_SCARR_FQN);

        // navigation
        final CsdlNavigationPropertyBinding navPropBinding = new CsdlNavigationPropertyBinding();
        navPropBinding.setTarget(ES_SFLIGHT_NAME); // the target entity set, where the navigation property points to
        navPropBinding.setPath(ES_SFLIGHT_NAME); // the path from entity type to navigation property
        final List<CsdlNavigationPropertyBinding> navPropBindingList = new ArrayList<>(Collections.singletonList(navPropBinding));
        entitySet.setNavigationPropertyBindings(navPropBindingList);

        return entitySet;
    }

    public static CsdlEntitySet getBookingEntitySet() {
        final CsdlEntitySet entitySet;
        entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SBOOK_NAME);
        entitySet.setType(ET_SBOOK_FQN);

        // navigation
        final CsdlNavigationPropertyBinding navPropBinding = new CsdlNavigationPropertyBinding();
        navPropBinding.setTarget("sds"); // the target entity set, where the navigation property points to
        navPropBinding.setPath("sds"); // the path from entity type to navigation property
        final List<CsdlNavigationPropertyBinding> navPropBindingList = new ArrayList<>(Collections.singletonList(navPropBinding));
        entitySet.setNavigationPropertyBindings(navPropBindingList);
        return entitySet;
    }

    public static CsdlEntitySet getPlaneEntitySet() {
        final CsdlEntitySet entitySet;
        entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SAPLANE_NAME);
        entitySet.setType(ET_SAPLANE_FQN);

        // navigation
        final CsdlNavigationPropertyBinding navPropBinding = new CsdlNavigationPropertyBinding();
        navPropBinding.setTarget("sds"); // the target entity set, where the navigation property points to
        navPropBinding.setPath("sds"); // the path from entity type to navigation property
        final List<CsdlNavigationPropertyBinding> navPropBindingList = new ArrayList<>(Collections.singletonList(navPropBinding));
        entitySet.setNavigationPropertyBindings(navPropBindingList);
        return entitySet;
    }
}
