package com.kamitsoft.client.ui.tabitem;


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



public class TabPanel extends FlowPanel implements HasClickHandlers{
   

    private SimplePanel icone;
    private Label title;
    
    
    public TabPanel(){
        super();
    }

    public TabPanel(TabItem tab){
        super();
        this.clear();
        icone = new SimplePanel();
        title = new Label();
        title.setText(tab.getItemTitle());
        decorate(tab.getIcone());
        add(icone);
        add(title);
    }

    private void decorate(String iconeStyle) {
        setStyleName("height-40px norightborder  margin-top-5px cursorpointer");
        icone.setStyleName("floatleft width-24px height-24px margin-top-8px  margin-left-7px  "+iconeStyle);
        title.setStyleName("lineheight40px margin-left-40px");
        
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }



	
    
	
}
