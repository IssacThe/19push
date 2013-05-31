package com.kamitsoft.client.core.bars.topbar.listpopup;

import java.util.ArrayList;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.kamitsoft.shared.beans.patient.PatientInfo;


public class PatientListPopupPresenter extends PresenterWidget<PatientListPopupPresenter.Display> {

	public interface Display extends PopupView {
		public void addPatient(ArrayList<PatientInfo> patientList );
		public void setSelectionHandler(PatientSelectionHandler handler);
		public void setPosition();
		
	}
	public interface PatientSelectionHandler{
		public void onPatientSelect(PatientInfo info);
	}
	private Display display;
	
	@Inject
	private PlaceManager placeManager; 
	
	@Inject
	public PatientListPopupPresenter(EventBus eventBus, Display view) {
	   super(eventBus, view);
	   display=view;	    
	}
	
	 
	@Override
	public void onBind(){
		super.onBind();
		getView().setSelectionHandler(new PatientSelectionHandler(){

			@Override
			public void onPatientSelect(PatientInfo info) {
				display(info);
			}
			
		});
		
	
	}
	
	protected void display(PatientInfo info) {
		System.out.println("display "+info.getFirstName());
	}

	public void addPatientList(ArrayList<PatientInfo> list){
		
		getView().addPatient(list);
	}
	
	public void show(){
		getView().setPosition();
		getView().show();
	}


	public void hide() {
		getView().hide();
		
	}


}