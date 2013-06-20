package com.kamitsoft.client.core.bars.bottombar;


import com.kamitsoft.client.core.share.SecuredItem;
import com.kamitsoft.client.i18n.MainDictionary;

public enum MenuItem implements SecuredItem{
    
    editPatient(ITEM_EDIT_PATIENT ), 
    editUser(ITEM_EDIT_USER),
    editRole(ITEM_EDIT_ROLE);
    
    public static MainDictionary dictionary;
    private int secureItemID;
    
    
    private MenuItem( int secureCodeID){
        secureItemID = secureCodeID;
    }
    
    public String getItemTitle(){
        switch(this){
            case editPatient:return dictionary.editPatient();
            case editUser:return dictionary.editUser();
            case editRole:return dictionary.editRole();
            default:return "";
        }
    }
    @Override
    public int getSecuredId() {
        return secureItemID;
    }

}
