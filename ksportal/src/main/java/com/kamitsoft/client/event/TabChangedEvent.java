
package com.kamitsoft.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.kamitsoft.client.core.patient.tab.TabItem;

public class TabChangedEvent extends GwtEvent<TabChangedEventHandler> {

    public static final Type<TabChangedEventHandler> TYPE = new Type<TabChangedEventHandler>();
    
    private TabItem tab;
    private int patientID;
    
    public TabChangedEvent(TabItem tab, int patientID) {
        this.tab = tab;
        this.patientID = patientID;
    }
    
    public TabItem getNewTab() {
        return tab;
    }
    
    public int getPatientID() {
        return patientID;
    }
    
    @Override
    public final Type<TabChangedEventHandler> getAssociatedType() {
        return TYPE;
    }
    

    
    @Override
    protected void dispatch(TabChangedEventHandler handler) {
        handler.tabDidChanged(this);
    }

   

   
   
}