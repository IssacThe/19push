package com.kamitsoft.client.core.patient;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.patient.PatientMainPresenter.TabClickHandler;
import com.kamitsoft.client.core.patient.tab.TabItem;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.ui.person.PersonInfoPanel;
import com.kamitsoft.client.ui.tabitem.TabPanel;
import com.kamitsoft.shared.beans.patient.PatientInfo;

public class PatientMainView extends ViewImpl implements PatientMainPresenter.Display {
    
    @UiField HTMLPanel contentPanel;
    @UiField SimplePanel tabsContentPanel;
    @UiField HTMLPanel tabsPanel;
    
    private final Widget widget;
    private TabClickHandler tabClickHandler;
    
    public interface Binder extends UiBinder<Widget, PatientMainView> {
    }
    
    @Inject
    public PatientMainView(final Binder binder, MainDictionary dictionary) {
        widget = binder.createAndBindUi(this);
        TabItem.dictionary = dictionary;
    }
    
    @Override
    public Widget asWidget() {
        return widget;
    }

    
    @Override
    public void setTabClickHandler(TabClickHandler handler) {
        tabClickHandler = handler;
    }
    
    @Override
    public void setInSlot(Object slot, Widget content) {
        if (slot == PatientMainPresenter.TYPE_TabsContentPanel) {
            tabsContentPanel.clear();
            tabsContentPanel.add(content);
        }
    }
    
    
    @Override
    public void addTab(final TabItem tabItem) {
        final TabPanel tab = new TabPanel(tabItem);
        tab.addClickHandler(new ClickHandler(){
            @Override
            public void onClick(ClickEvent event) {
                for(int i=0;i<tabsPanel.getWidgetCount(); i++){
                	tabsPanel.getWidget(i).removeStyleName("positionrelative");
                }
                tab.addStyleName("positionrelative");
                tabClickHandler.onTabClicked(tabItem);
            }
        });
        tabsPanel.add(tab);
    }

}
		