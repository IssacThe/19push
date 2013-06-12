package com.kamitsoft.client.ui.tooglebutton;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;



public class ToogleMenu extends FlowPanel implements HasClickHandlers{
	
   
    private SimplePanel icon;
    private Label menuName;
    private SimplePanel triangleIcon;
    private boolean openState; 
   

	public ToogleMenu(){
		  super();
		  this.clear();
		  icon = new SimplePanel();
		  menuName = new Label("Administration");
		  triangleIcon = new SimplePanel();
		  
		  decorate();
		  add(icon);
		  add(menuName);
		  add(triangleIcon);
		  openState = false;
		 
		  
    }

	private void decorate() {
		icon.addStyleName("floatleft settingicone padding-top-5px");
		icon.setWidth("18%");
		menuName.addStyleName("floatleft boldtext padding-left-5px padding-right-5px");
		menuName.setWidth("60%");
		triangleIcon.addStyleName("floatleft triangleopenicone padding-top-20px");
		triangleIcon.setWidth("14%");
		
	}

	public void click(){
		if(openState){
			triangleIcon.removeStyleName( "trianglecloseicone");
			triangleIcon.addStyleName("triangleopenicone");
			openState = false;
		}else{
			triangleIcon.removeStyleName("triangleopenicone");
			triangleIcon.addStyleName( "trianglecloseicone ");
			openState = true;
		}
	}
	
	@Override
	public HandlerRegistration addClickHandler(final ClickHandler handler) {
		
	        return addDomHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
					click();
					handler.onClick(event);
					
				}
	        	
	        }, ClickEvent.getType());
	        
	}



	
    
	
}
