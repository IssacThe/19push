package com.kamitsoft.client.core.bars.bottombar;


import com.kamitsoft.client.core.share.SecuredItem;
import com.kamitsoft.client.i18n.MainDictionary;

public enum MenuItem implements SecuredItem{
    
    addPatient(ITEM_ADD_PATIENT ), 
    addNote(ITEM_ADD_NOTE),
    manageAccount(ITEM_MANAGE_ACCOUNT),
    manageSystem(ITEM_MANAGE_SYSTEM);
   
    
    public static MainDictionary dictionary;
    private int secureItemID;
    
    
    private MenuItem( int secureCodeID){
        secureItemID = secureCodeID;
    }
    
    public String getItemTitle(){
        switch(this){
            case addPatient:return dictionary.addPatient();
            case addNote:return dictionary.addNote();
            case manageAccount:return dictionary.manageAccount();
            case manageSystem:return dictionary.manageSystem();
            default:return "";
        }
    }
    @Override
    public int getSecuredId() {
        return secureItemID;
    }

}
