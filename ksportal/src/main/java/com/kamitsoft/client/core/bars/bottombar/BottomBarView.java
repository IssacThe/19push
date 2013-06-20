package com.kamitsoft.client.core.bars.bottombar;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter.MenuItemClickHandler;
import com.kamitsoft.client.ui.tooglebutton.ToogleMenu;
import com.kamitsoft.client.ui.ul.ListItem;
import com.kamitsoft.client.ui.ul.UListWidget;


public class BottomBarView extends ViewImpl implements BottomBarPresenter.Display {

    private final Widget widget;
    
    @UiField ToogleMenu toogleMenu;
    @UiField HTMLPanel unsortedListPanel;
    
    private MenuItemClickHandler itemClickHandler;
    
    public interface Binder extends UiBinder<Widget, BottomBarView> {
    }
  
    @Inject
    public BottomBarView(final Binder binder) {
        widget = binder.createAndBindUi(this);
        unsortedListPanel.setVisible(false);
        toogleMenu.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if(unsortedListPanel.isVisible()){
                    unsortedListPanel.setVisible(false);
                }else{
                    unsortedListPanel.setVisible(true);
                }
            }});
    }

    public Widget asWidget() {
        return  widget;  
    }

    @Override
    public void setItemClickHandler(MenuItemClickHandler handler) {
    	itemClickHandler = handler;
    	
    }

    @Override
    public void addItems(ArrayList<MenuItem> items) {
        UListWidget ul= new UListWidget();
        ul.setStyleName("patientlistul");
        for(final MenuItem item :items){
            ListItem i = new ListItem(item.getItemTitle()); 
            i.addClickHandler(new ClickHandler(){
                @Override
                public void onClick(ClickEvent event) {
                    itemClickHandler.onMenuItemClicked(item);
                    unsortedListPanel.setVisible(false);
                    toogleMenu.click();
                }
            });
            i.addStyleName("adminmenuitem cursorpointer padding-left-10px");
            ul.add(i);
        }
        unsortedListPanel.add(ul);
    }

}