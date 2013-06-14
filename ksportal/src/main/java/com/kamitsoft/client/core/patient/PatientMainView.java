package com.kamitsoft.client.core.patient;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.ui.carousel.CarouselPanel;
import com.kamitsoft.client.ui.person.PersonInfoPanel;
import com.kamitsoft.shared.beans.patient.PatientInfo;

public class PatientMainView extends ViewImpl implements PatientMainPresenter.Display {

		@UiField HTMLPanel contentPanel;
		@UiField PersonInfoPanel personalInfoPanel;
		private final Widget widget;
	
		public interface Binder extends UiBinder<Widget, PatientMainView> {
		}
	
		
		
		
		@Inject
		public PatientMainView(final Binder binder) {
			widget = binder.createAndBindUi(this);
		}
	
		@Override
		public Widget asWidget() {
			return widget;
		}
		
		
		

		@Override
		public void setPatient(PatientInfo patientInfo){
			personalInfoPanel.setInfo(patientInfo);
		}
	    
		

}
		