package com.kamitsoft.client.core.patient;


import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.client.ui.loader.AsyncCall;
import com.kamitsoft.remote.rpc.PatientAsync;
import com.kamitsoft.shared.beans.patient.PatientInfo;


public class PatientPresenter extends Presenter<PatientPresenter.Display, PatientPresenter.Proxy> {

	  public interface Display extends View {

		void setPatient(PatientInfo patientInfo);

	
		  
	  };
	  //@ContentSlot
	  //public static final Type<RevealContentHandler<?>> TYPE_Login = new Type<RevealContentHandler<?>>();
	  
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.patient)
	  public interface Proxy extends ProxyPlace<PatientPresenter> {}
	  private Display display;
	  @Inject private UserContext context;
	 
	  
	  
	  @Inject
	  public PatientPresenter(EventBus eventBus, Display view, Proxy proxy) {
		   super(eventBus, view, proxy);
		   display=view;
		  
	  }
	
	 
	  @Override
	  public void onBind(){
		  super.onBind();
		  
			  
	  }
	
	
	  @Override
	  public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		int patientID = Integer.parseInt(request.getParameter("patientID", "0"));
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
					getView().setPatient(result.get(0));
					
				}

		 });
		  
		
		
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