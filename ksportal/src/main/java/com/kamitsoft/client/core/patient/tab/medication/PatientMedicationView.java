package com.kamitsoft.client.core.patient.tab.medication;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter.MenuItemClickHandler;
import com.kamitsoft.client.ui.tooglebutton.ToogleMenu;


public class PatientMedicationView extends ViewImpl implements PatientMedicationPresenter.Display {

    private final Widget widget;
   
    
    
    
    public interface Binder extends UiBinder<Widget, PatientMedicationView> {}

    @Inject
    public PatientMedicationView(final Binder binder) {
        widget = binder.createAndBindUi(this);
    }


    public Widget asWidget() {
        return  widget;
    }


}