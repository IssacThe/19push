package com.kamitsoft.client.core.share;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.kamitsoft.client.core.patient.PatientMainPresenter;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.event.TabChangedEvent;


public abstract class KSTabPresenter<V extends View ,P extends Proxy<?>> extends Presenter<V , P> {
    
   

    protected static int patientID;
    protected EventBus eventBus;

    public KSTabPresenter(EventBus eventBus, V view, P proxy) {
        super(eventBus, view, proxy);
        this.eventBus = eventBus;
    }
    
    public abstract TabItem getTabItem();
    
  
    
    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        int id = Integer.parseInt(request.getParameter("patientID", "0"));
        if(id > 0 && id !=patientID){
            patientID = id;
        }
        eventBus.fireEvent(new TabChangedEvent(getTabItem(),patientID));
    }
    
}
