package com.kamitsoft.client.core.share.confirmation;



import com.google.gwt.user.client.ui.FlowPanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class WarningPopup extends PopupPanel{
    private FlowPanel content = new FlowPanel();
    public WarningPopup(String msg) {
        super(true);
        setWidget(content);
        setAutoHideEnabled(false);
        setAutoHideEnabled(true);
        setStyleName("leavingConfirmation roundedborder5px");
        
        
        content.add(new Label(msg));
        addDownArrow();
       
      }
    public void addDownArrow(){
        SimplePanel div = new SimplePanel();
        div.setStyleName("arrow-down ");
        content.add(div);
        
    }
}
