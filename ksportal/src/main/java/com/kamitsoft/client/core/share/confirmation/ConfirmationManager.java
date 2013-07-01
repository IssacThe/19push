package com.kamitsoft.client.core.share.confirmation;

import java.util.ArrayList;



public class ConfirmationManager {
    private ArrayList<Confirmable> fields = new  ArrayList<Confirmable>();
    private ArrayList<WarningPopup> popups = new ArrayList<WarningPopup>();
    
    public ConfirmationManager(){
        
    }
    public boolean validate(){
        boolean valide = true;
        for(Confirmable field: fields){
            if(!field.validate()){
                valide = false;
               // warn(field, field.getValidator().getMessage());
            }
        }
        return valide;
    }

    private void warn(Confirmable field, String message) {
        
        popups.add( new WarningPopup(message));
        popups.get(popups.size()-1).setPopupPosition(field.getAbsoluteFieldLeft(), field.getAbsoluteTop()-20);
        popups.get(popups.size()-1).show();
        
    }
    
    public void reset(){
        fields.clear();
        for(WarningPopup w:popups){
            w.hide();
        }
        popups.clear();
    }
    
    public void confirmLeaving(Confirmable field, String message, boolean validateOnfly, Validator v){
        v.setMessage(message);
        fields.add(field);
        
    }

}
