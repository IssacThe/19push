package com.kamitsoft.client.core.bars.bottombar;
import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.security.UserContext;



public class BottomBarPresenter extends PresenterWidget<BottomBarPresenter.Display> {

    public interface Display extends View {
        void setItemClickHandler(MenuItemClickHandler handler) ;
        void addItems( ArrayList<MenuItem> items) ;
    }
    
    public interface MenuItemClickHandler{
        void onMenuItemClicked(MenuItem item);
    }
    
    private Display display;
    
    @Inject private PlaceManager placeManager;
    
    private UserContext context;

    @Inject
    public BottomBarPresenter(EventBus eventBus, Display view, UserContext context, MainDictionary dictionary) {
        super(eventBus, view);
        display=view;
        this.context = context;
        MenuItem.dictionary = dictionary;
        addMenuItems();
        
    }

    private void addMenuItems() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        for(MenuItem item :MenuItem.values()){
            if(context.isAllowedItem(item)){
                items.add(item);
            }
        }
        getView().addItems(items);
    }

	@Override
    public void onBind(){
      super.onBind();
      getView().setItemClickHandler(new MenuItemClickHandler(){
        @Override
        public void onMenuItemClicked(MenuItem item) {
        }

      });
    }

    protected void displayPlace(String  place) {
        PlaceRequest pr = new PlaceRequest(place);
        placeManager.revealPlace(pr);
    }

}