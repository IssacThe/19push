package com.kamitsoft.client.core.patient.tab.allergy;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter.MenuItemClickHandler;
import com.kamitsoft.client.ui.tooglebutton.ToogleMenu;


public class PatientAllergyView extends ViewImpl implements PatientAllergyPresenter.Display {

    private final Widget widget;
   
    
    
    
    public interface Binder extends UiBinder<Widget, PatientAllergyView> {}

    @Inject
    public PatientAllergyView(final Binder binder) {
        widget = binder.createAndBindUi(this);
    }


    public Widget asWidget() {
        return  widget;
    }


}