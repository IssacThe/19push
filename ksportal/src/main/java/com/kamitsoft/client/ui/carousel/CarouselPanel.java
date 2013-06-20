package com.kamitsoft.client.ui.carousel;

import java.util.ArrayList;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class CarouselPanel extends LayoutPanel {
    int itsCurrentWidget = 0;
    private ArrayList<Widget> litsWidgets =  new ArrayList<Widget>();
    private HandlerRegistration itsRightHandler;
    private boolean isCircular;
    private Timer t;

    @Override
    public void clear() {
        super.clear();
        litsWidgets.clear();
        itsCurrentWidget = 0;
    }

    public void setWidgetItem(Widget widget){
        if(!litsWidgets.contains(widget)){
            litsWidgets.add(widget);
        }
    }
    public void setCenter(Widget widget, boolean newWidget) {
        if (widget != null) {
            if (newWidget){
                add(widget);
              
            }
            setWidgetLeftWidth(widget, 10, Unit.PCT, 80, Unit.PCT);   
            setWidgetTopHeight(widget, 10, Unit.PCT, 80, Unit.PCT);
            widget.removeStyleName("sideCarousel");
            widget.setStylePrimaryName("centerCarousel");
        }
    }
    
    private void setRight(Widget widget, boolean newWidget) {
        if (widget != null) {
            if (newWidget){
                add(widget);
            }
            setWidgetLeftWidth(widget, 50, Unit.PCT, 45, Unit.PCT);  
            setWidgetTopHeight(widget, 20, Unit.PCT, 60, Unit.PCT);
            widget.removeStyleName("centerCarousel");
            widget.setStylePrimaryName("sideCarousel");
            if (itsRightHandler != null)
                itsRightHandler.removeHandler();
                itsRightHandler = widget.addDomHandler(new ClickHandler() {
                public void onClick(final ClickEvent event) {
                    scrollRight();
                }
            }, ClickEvent.getType());
        }
    }
    
    private void setLeft(Widget widget, boolean newWidget) {
        if (widget != null) {
            if (newWidget){
                add(widget);
            }
            setWidgetRightWidth(widget, 50, Unit.PCT, 45, Unit.PCT);  
            setWidgetTopHeight(widget, 20, Unit.PCT, 60, Unit.PCT);
            widget.removeStyleName("centerCarousel");
            widget.setStylePrimaryName("sideCarousel");
            if (itsRightHandler != null)
                itsRightHandler.removeHandler();
                itsRightHandler = widget.addDomHandler(new ClickHandler() {
                public void onClick(final ClickEvent event) {
                    scrollLeft();
                }
            }, ClickEvent.getType());
        }
    }
    
    public void scrollRight() {
        if (!isCircular && itsCurrentWidget > getWidgetCountInCarousel()){
            return;
        }
        
        Widget hideWidget = getWidgetInCarousel(itsCurrentWidget-1);
        remove(hideWidget);
        
        Widget leftWidget = getWidgetInCarousel(itsCurrentWidget);
        Widget centerWidget = getWidgetInCarousel(++itsCurrentWidget);
        Widget rightWidget = getWidgetInCarousel(itsCurrentWidget+1);
        
        setLeft(leftWidget, false);
        setCenter(centerWidget, false);
        setRight(rightWidget, true);
        
        animate(500);
        
    }
    
    public void scrollLeft() {
        if (!isCircular &&  itsCurrentWidget <= 0){
            return;
        }
        
        Widget hideWidget = getWidgetInCarousel(0);
        remove(hideWidget);
        
        Widget rightWidget = getWidgetInCarousel(itsCurrentWidget);
        Widget centerWidget = getWidgetInCarousel(--itsCurrentWidget);
        Widget leftWidget = getWidgetInCarousel(itsCurrentWidget-1);
        
        setLeft(leftWidget, true);
        setCenter(centerWidget, false);
        setRight(rightWidget, false);
        animate(500);
    }

    private Widget getWidgetInCarousel(int idx) {
        if(isCircular){
            idx = idx < 0 ? (litsWidgets.size()-1):(idx % litsWidgets.size());
        }
        return litsWidgets.get(idx);
    }

    private int getWidgetCountInCarousel() {
        return litsWidgets.size();
    }
    
    public void forwardCirculare(){
        isCircular = true;
        itsCurrentWidget = 0;
        setCenter(getWidgetInCarousel(itsCurrentWidget),true);
        setRight(getWidgetInCarousel(itsCurrentWidget+1),true);
        if(t!=null){
            t.cancel();
        }else{
            t = new Timer(){
                @Override
                public void run() {
                	scrollRight();
                }
            };
        }
        t.scheduleRepeating(3000);
    }
    
    public void rewindCirculare(){
        isCircular = true;
        itsCurrentWidget = 0;
        setCenter(getWidgetInCarousel(itsCurrentWidget),true);
        setRight(getWidgetInCarousel(itsCurrentWidget-1),true);
        if(t!=null){
        	t.cancel();
        }else{
            t = new Timer(){
                @Override
                public void run() {
                    scrollLeft();
                }
            };
        }
        t.scheduleRepeating(3000);
    }

}
