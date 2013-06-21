package com.kamitsoft.client.core.share;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.kamitsoft.client.core.patient.tab.TabItem;


public abstract class KSTabPresenter<V extends View ,P extends Proxy<?>> extends Presenter<V , P> {
    
   

    public KSTabPresenter(EventBus eventBus, V view, P proxy) {
        super(eventBus, view, proxy);
    }
    
    public abstract TabItem getTabItem();
}
