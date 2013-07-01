package com.kamitsoft.client.core.share.confirmation;

import java.util.ArrayList;

import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PopupPanel;

public abstract class Confirmable extends HorizontalPanel{
    protected ArrayList<Validator> validators = new ArrayList<Validator>();
    
 
    
    public ArrayList<Validator>  getValidators() {
        return validators;
    }

    public void addValidator(Validator validator) {
        this.validators.add(validator);
    }
    public boolean validate() {
        for(Validator v:validators){
            if(!v.validate()){
                warn(v);
                return false;
            }
        } 
        return true;
    }
    
    protected boolean onBlurValidate(){
        for(Validator v:validators){
            if(v.needLiveConfirm() && !v.validate()){
                warn(v);
                return false;
            }
        } 
        return true;
        
         
    }
    
    private void warn(Validator v){
        WarningPopup popup = new WarningPopup(v.getMessage());
        popup.setPopupPosition(getAbsoluteFieldLeft()-20, getAbsoluteTop()-getOffsetHeight()-16);
        popup.show();
        popup.addCloseHandler(new CloseHandler<PopupPanel>() {
            
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                restoreValue();
                
            }
        });
    
    }
    protected abstract void restoreValue();
    protected abstract int getAbsoluteFieldLeft();
}
