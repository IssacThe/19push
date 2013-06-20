package com.kamitsoft.client.core.patient;


import java.util.ArrayList;


import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.core.patient.tab.info.PatientInfoPresenter;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.client.ui.loader.AsyncCall;
import com.kamitsoft.remote.rpc.PatientAsync;
import com.kamitsoft.shared.beans.patient.PatientInfo;


public class PatientMainPresenter extends Presenter<PatientMainPresenter.Display, PatientMainPresenter.Proxy> {
    public interface Display extends View {
        void setTabClickHandler(TabClickHandler handler) ;
        void addTab(TabItem tab);
    };
    
    public interface TabClickHandler{
        void onTabClicked(TabItem item);
    }
    @ProxyCodeSplit
    @NameToken(NamesTokens.patient)
    public interface Proxy extends ProxyPlace<PatientMainPresenter> {};

    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanel = new Type<RevealContentHandler<?>>();
    
    
    private Display display;
    @Inject private UserContext context;
    @Inject private PatientInfoPresenter patientInfoPresenter;
    private EventBus eventBus;

    @Inject
    public PatientMainPresenter(EventBus eventBus, Display view, Proxy proxy, MainDictionary dictionary) {
        super(eventBus, view, proxy);
        display=view;
        this.eventBus= eventBus;
        getView().setTabClickHandler(new TabClickHandler(){
        
            @Override
            public void onTabClicked(TabItem item) {
                switch(item){
                case patientInfo: gotoPatientInfo();
                    break;
                case  patientSocial:gotoPatientSocial();
                    break;
                case patientMedication:gotoPatientMedication();
                    break;
                }
            }});
           
         for(TabItem tab:TabItem.values()){
           getView().addTab(tab);
         }
    }
    
     
    protected void gotoPatientMedication() {

    }
    
    
    protected void gotoPatientSocial() {

    }
    
    
    protected void gotoPatientInfo() {

      }
    
    
    @Override
    public void onBind(){
        super.onBind();
    }
    
    
    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        int patientID = Integer.parseInt(request.getParameter("patientID", "0"));
        int tabID = Integer.parseInt(request.getParameter("tabID", "0"));
        retrievePatient(patientID);
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
      protected void revealInParent() {
          RevealContentEvent.fire(this, MainPagePresenter.TYPE_MainContent, this);
          setInSlot(TYPE_TabsContentPanel, patientInfoPresenter);
    	
    
      }
    
    
      @Override
      protected void onReveal() {
    	super.onReveal();
    	
      }

}