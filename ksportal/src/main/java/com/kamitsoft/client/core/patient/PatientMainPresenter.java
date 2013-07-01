package com.kamitsoft.client.core.patient;


import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.core.patient.tab.info.PatientInfoPresenter;
import com.kamitsoft.client.event.TabChangedEvent;
import com.kamitsoft.client.event.TabChangedEventHandler;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;




public class PatientMainPresenter extends Presenter<PatientMainPresenter.Display, PatientMainPresenter.Proxy> {
    public interface Display extends View {
        void setTabClickHandler(TabClickHandler handler) ;
        void addTab(TabItem tab);
        void setCurrentTable(TabItem currentTab);
    };
    
    public interface TabClickHandler{
        void onTabClicked(TabItem item);
    };
    
    @ProxyCodeSplit
    @NameToken(NamesTokens.patient)
    public interface Proxy extends ProxyPlace<PatientMainPresenter>{};
    
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanel = new Type<RevealContentHandler<?>>();
    /*@ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanelAllergy = new Type<RevealContentHandler<?>>();
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanelImmu = new Type<RevealContentHandler<?>>();
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanelMed = new Type<RevealContentHandler<?>>();
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanelSocial = new Type<RevealContentHandler<?>>();
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_TabsContentPanelVital = new Type<RevealContentHandler<?>>();*/
    
    
    @Inject private UserContext context;
    @Inject private PatientInfoPresenter patientInfoPresenter;
    @Inject private PlaceManager placeManager; 
    private EventBus eventBus;

   

    @Inject
    public PatientMainPresenter(EventBus eventBus, Display view, Proxy proxy, MainDictionary dictionary) {
        super(eventBus, view, proxy);
     
        this.eventBus= eventBus;
        getView().setTabClickHandler(new TabClickHandler(){
        
            @Override
            public void onTabClicked(TabItem item) {
                gotoTab(item.getNameToken());
            }
         });
           
         for(TabItem tab:TabItem.values()){
           getView().addTab(tab);
         }
    }
    

    
    
    protected void gotoTab(String nameToken) {
        PlaceRequest request = new PlaceRequest(nameToken);
        placeManager.revealPlace(request);
       
    }
    
    
    @Override
    public void onBind(){
        super.onBind();
        registerHandler(eventBus.addHandler(TabChangedEvent.TYPE, new TabChangedEventHandler(){

            @Override
            public void tabDidChanged(TabChangedEvent event) {
                getView().setCurrentTable(event.getNewTab());
                
            }
            
        }));
    }
    
    
    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        
        
        
    }

    
    
    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, MainPagePresenter.TYPE_MainContent, this);
    }
    
    
    @Override
    protected void onReveal() {
        super.onReveal();
        
    }

   
    
    
}