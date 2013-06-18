package com.kamitsoft.client.ui.person;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.shared.beans.patient.PatientInfo;



public class PatientItemListWidget extends FlowPanel implements HasClickHandlers{
	    private Label firstName;
	    private Label laststName;
	    private Label dob;
	    
	    private Label patientId;

		public PatientItemListWidget(PatientInfo info){
			
			  super();
			  this.clear();
			  dob = new Label();
			  
			  firstName = new Label();
			  patientId = new Label();
			  laststName = new Label();
			  decorate();
			  add(firstName);
			  add(laststName);
			  add(dob);
			 
			  add(patientId);
			
			  
			  firstName.setText(info.getFirstName());
			  laststName.setText(info.getLastName());
			  
			  DateTimeFormat df = DateTimeFormat.getFormat(PredefinedFormat.DATE_FULL ); 
			 
			  df.format(info.getDob());
			  dob.setText(df.format(info.getDob())+ "  "+info.getPob());
			 
			  patientId.setText("#"+String.valueOf(info.getPatientID()));
			  
	    }

		private void decorate() {
			 firstName.setStyleName("displayinline margin-right-3px");
			 laststName.setStyleName("displayinline margin-right-3px");
			 dob.setStyleName(" margin-right-3px smalltextgrey");
			 patientId.setStyleName("margin-right-3px smalltextgrey margin-top-10px");
			 this.removeStyleName("cursorpointer");
			 this.addStyleName("cursorpointer");
			
		}

		@Override
		public HandlerRegistration addClickHandler(ClickHandler handler) {
			
		        return addDomHandler(handler, ClickEvent.getType());
		        
		}



   
	
    
	
}
