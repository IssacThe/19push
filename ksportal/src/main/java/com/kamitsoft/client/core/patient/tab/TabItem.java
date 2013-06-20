package com.kamitsoft.client.core.patient.tab;


import com.kamitsoft.client.core.share.SecuredItem;
import com.kamitsoft.client.i18n.MainDictionary;

public enum TabItem implements SecuredItem{
    
    patientInfo(TAB_PATIENT_INFO ), 
    patientSocial(TAB_PATIENT_SOCIAL),
    patientMedication(TAB_PATIENT_MEDICATION);
    
    public static MainDictionary dictionary;
    private int secureItemID;
    
    
    private TabItem( int secureCodeID){
    	secureItemID = secureCodeID;
    }
    
    public String getItemTitle(){
        switch(this){
            case patientInfo:return dictionary.info();
            case patientSocial:return dictionary.social();
            case patientMedication:return dictionary.medication();
            default:return "";
        }
    }
    @Override
    public int getSecuredId() {
        return secureItemID;
    }

}
