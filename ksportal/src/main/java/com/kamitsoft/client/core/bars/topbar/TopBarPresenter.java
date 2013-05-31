package com.kamitsoft.client.core.bars.topbar;
import java.util.ArrayList;


import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.kamitsoft.client.core.bars.topbar.listpopup.PatientListPopupPresenter;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.remote.rpc.PatientAsync;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;


public class TopBarPresenter extends PresenterWidget<TopBarPresenter.Display> {

	public interface Display extends View {
		  void setSearchBoxChangeHandler(KeyUpHandler handler);
		  String  getSearchText();
		
	}

	private Display display;
	
	@Inject private PlaceManager placeManager;
	@Inject private PatientListPopupPresenter listpopup;
	@Inject private UserContext context;
	@Inject private PatientParameters search ;
	private Timer timer;
	@Inject
	public TopBarPresenter(EventBus eventBus, Display view) {
	   super(eventBus, view);
	   display=view;	    
	}
	
	 
	@Override
	public void onBind(){
		super.onBind();
		
		getView().setSearchBoxChangeHandler(new KeyUpHandler(){

			@Override
			public void onKeyUp(KeyUpEvent event){
				if(getView().getSearchText().length()<3){
					listpopup.hide();
					return;
				}
				if(timer!=null){
					timer.cancel();
					timer= null;
				}
				
				timer = new Timer(){
					@Override
					public void run() {
						searchPatient(getView().getSearchText());
					}
					
				};
				
				timer.schedule(500);
			}
			

			
			
		});
	}
	
	protected void searchPatient(String searchText) {
		search.clearParameters();
		search.setFreeText(searchText);
		search.setAccountID(context.getAccountID());
		
		PatientAsync patientAsyn = PatientAsync.Util.getInstance();
		patientAsyn.searchPatient(context,search, new AsyncCallback<ArrayList<PatientInfo>>() {

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
			}

			@Override
			public void onSuccess(ArrayList<PatientInfo> result) {
				listpopup.addPatientList(result);
				listpopup.show();
				
			}
		   
		  });
		
	}


	protected void displayPlace(String  place) {
		PlaceRequest pr = new PlaceRequest(place);
		placeManager.revealPlace(pr);
		
	}


}