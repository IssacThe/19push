package com.kamitsoft.client.ui.person;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;



public class PersonInfoPanel extends FlowPanel implements HasClickHandlers{
    private Label title;
    private Label firstName;
    private Label middleName;
    private Label laststName;
    

    public void setInfo(HasPersonInfo info){
      this.clear();
      title = new Label();
      title.setText("Dr ");
      title.setStyleName("displayinline margin-right-3px");
      
      firstName = new Label();
      firstName.setText(info.getFirstName());
      firstName.setStyleName("displayinline margin-right-3px");
      
      middleName = new Label();
      middleName.setText(info.getMiddleName());
      middleName.setStyleName("displayinline margin-right-3px");
      
      laststName = new Label();
      laststName.setText(info.getLastName());
      laststName.setStyleName("displayinline margin-right-3px");
      
      add(title);
      add(firstName);
      add(middleName);
      add(laststName);
      this.removeStyleName("cursorpointer");
      this.addStyleName("cursorpointer");
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

}
