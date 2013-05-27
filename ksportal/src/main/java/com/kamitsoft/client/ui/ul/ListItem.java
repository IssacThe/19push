
package com.kamitsoft.client.ui.ul;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;


public class ListItem extends SimplePanel implements HasClickHandlers{
    
    public ListItem(){
        super((Element) Document.get().createLIElement().cast());
    }
 
    /**
     * To create a simple LI element that will display the text
     * @param s String to be displayed (no interpretation of HTML)
     */
    public ListItem(String s){
        this();
        getElement().setInnerText(s);
    }
 
    
    /**
     * To create an LI element that will have a widget.
     * @param w
     */
    public ListItem(Widget w){
        this();
        this.add(w);
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
        
    }
    
   
}
