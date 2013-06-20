package com.kamitsoft.client.core.patient.tab.info;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.security.UserContext;



public class PatientInfoPresenter extends PresenterWidget<PatientInfoPresenter.Display> {
    public interface Display extends View {};
    
    private  TabItem  tabItem = TabItem.patientInfo;
    private Display display;
    @Inject private PlaceManager placeManager;
    private UserContext context;

    @Inject
    public PatientInfoPresenter(EventBus eventBus, Display view, UserContext context, MainDictionary dictionary) {
        super(eventBus, view);
        display=view;
        this.context = context;
        
        
    }

    @Override
    public void onBind(){
        super.onBind();
    }

    protected void displayPlace(String  place) {
        PlaceRequest pr = new PlaceRequest(place);
        placeManager.revealPlace(pr);

    }
    
    public TabItem getTabItem(){
        return tabItem;
    }

}