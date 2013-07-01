package com.kamitsoft.client.core.patient.tab.allergy;


import java.util.ArrayList;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.kamitsoft.client.core.patient.PatientMainPresenter;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.core.share.KSTabPresenter;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.client.ui.loader.AsyncCall;
import com.kamitsoft.remote.rpc.PatientAsync;
import com.kamitsoft.shared.beans.patient.PatientInfo;



public class PatientAllergyPresenter extends KSTabPresenter<PatientAllergyPresenter.Display, PatientAllergyPresenter.Proxy> {
    public interface Display extends View {};
    
    
    private Display display;
    @Inject private PlaceManager placeManager;
    private UserContext context;

    @ProxyCodeSplit
    @NameToken(NamesTokens.patientAllergy)
    public interface Proxy extends ProxyPlace<PatientAllergyPresenter> {};
    
    @Inject
    public PatientAllergyPresenter(EventBus eventBus, Display view, UserContext context, MainDictionary dictionary, Proxy proxy) {
        super(eventBus, view, proxy);
        display=view;
        this.context = context;
        
        
    }

 

    protected void displayPlace(String  place) {
        PlaceRequest pr = new PlaceRequest(place);
        placeManager.revealPlace(pr);

    }
    
    

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        retrievePatient(patientID);
    }
    
    @Override
    public void onBind(){
        super.onBind();
    }

    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, PatientMainPresenter.TYPE_TabsContentPanel, this);
       
    }
    
    private void retrievePatient(int patientID) {
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(patientID);
        PatientAsync patientAsyn = PatientAsync.Util.getInstance();
        patientAsyn.getFromIDs(context, ids,  new AsyncCall<ArrayList<PatientInfo>>() {
    
            @Override
            protected void didFail(Throwable caught) {
                
            }
            
            @Override
            protected void didSuccess(ArrayList<PatientInfo> result) {
                //getView().setPatient(result.get(0));
                
            }
        });
        
      }



    @Override
    public TabItem getTabItem() {
        return TabItem.patientAllergy;
    }
    

}