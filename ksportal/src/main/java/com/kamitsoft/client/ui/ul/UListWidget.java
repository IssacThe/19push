
package com.kamitsoft.client.ui.ul;

import java.util.ArrayList;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;


public class UListWidget extends ComplexPanel {
    
    public UListWidget() {
        setElement(Document.get().createULElement());
    }

    public void setId(String id) {
        // Set an attribute common to all tags
        getElement().setId(id);
    }
    
    public void setDir(String dir) {
        // Set an attribute specific to this tag
        ((UListElement) getElement().cast()).setDir(dir);
    }

    public void add(Widget w) {
        // ComplexPanel requires the two-arg add() method
        super.add(w, getElement());
    }
    
    public void add(ArrayList<ListItem> w) {
        for (Widget widget : w) {
            this.add(widget);
        }
    }
    
  
    public void showMore(ArrayList<Widget> newItems, Widget showMore){
        this.remove(this.getWidgetCount()); // TEST if 0 or 1 base
        for (Widget widget : newItems) {
            this.add(widget);
        }
        if (showMore != null) {
            this.add(showMore);
        }
    }
    
}