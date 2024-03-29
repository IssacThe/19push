package com.kamitsoft.client.core.bars.topbar.listpopup;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;
import com.kamitsoft.client.core.bars.topbar.listpopup.PatientListPopupPresenter.PatientSelectionHandler;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.ui.person.PatientItemListWidget;
import com.kamitsoft.client.ui.ul.ListItem;
import com.kamitsoft.client.ui.ul.UListWidget;
import com.kamitsoft.shared.beans.patient.PatientInfo;


public class PatientListPopupView extends PopupViewImpl implements PatientListPopupPresenter.Display {

    @UiField HTMLPanel unsortedListPanel;
    private final Widget widget;
    private MainDictionary dictionary;
    private UListWidget ul;
    private PatientSelectionHandler patientSelectionHandler;
    public interface Binder extends UiBinder<Widget, PatientListPopupView> {}
    
    @Inject
    public PatientListPopupView(final Binder binder, EventBus eventBus,MainDictionary dictionary) {
        super(eventBus);
        widget = binder.createAndBindUi(this);
        this.dictionary = dictionary;
        ul = new UListWidget();
        ul.setStyleName("patientlistul");
        unsortedListPanel.add(ul);
    }
    
    public Widget asWidget() {
        return  widget;
    }
    
    @Override
    public void setSelectionHandler(PatientSelectionHandler handler){
        patientSelectionHandler = handler;
    }
    
    @Override
    public void addPatient(ArrayList<PatientInfo> patientList){
        ArrayList<ListItem> items = new ArrayList<ListItem>();
        for(final PatientInfo info:patientList){
            ListItem item = new ListItem(); 
            item.add(new PatientItemListWidget(info));
            item.setStyleName("patientlistil");
            item.addClickHandler(new ClickHandler(){
                @Override
                public void onClick(ClickEvent event) {
                    patientSelectionHandler.onPatientSelect(info);
                    hide();
                }
            });
            items.add(item);
        }
        ul.clear();
        ul.add(items);
    }
    
    @Override
    public void setPosition() {
        Element sbox = DOM.getElementById("searchboxid");
        setPosition(sbox.getAbsoluteLeft()+50, sbox.getAbsoluteTop()+35);
    }

}