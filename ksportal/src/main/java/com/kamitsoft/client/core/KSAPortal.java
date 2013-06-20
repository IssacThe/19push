package com.kamitsoft.client.core;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.kamitsoft.gin.KSAPortalGinjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class KSAPortal implements EntryPoint {
    public final KSAPortalGinjector ginjector = GWT.create(KSAPortalGinjector.class);
    
    public void onModuleLoad() {
        DelayedBindRegistry.bind(ginjector);
        ginjector.getPlaceManager().revealDefaultPlace();    
    }
}
