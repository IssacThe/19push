package com.kamitsoft.client.core.patient.tab;


import com.kamitsoft.client.core.share.SecuredItem;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.places.NamesTokens;

public enum TabItem implements SecuredItem{
    
    patientInfo(TAB_PATIENT_INFO ,"patientinfoicone",NamesTokens.patientInfo), 
    patientSocial(TAB_PATIENT_SOCIAL,"patientsocialicone",NamesTokens.patientSocial),
    patientMedication(TAB_PATIENT_MEDICATION,"patientmedicone",NamesTokens.patientMedication),
    patientAllergy(TAB_PATIENT_ALLERGY,"patientallergyicone",NamesTokens.patientAllergy),
    patientImmunization(TAB_PATIENT_IMMUNIZATION,"patientimmunizationicone",NamesTokens.patientImmunization),
    patientVital(TAB_PATIENT_VITAL,"patientvitalicone",NamesTokens.patientVitals);
    
   
    public static MainDictionary dictionary;
    private int secureItemID;
    private String icone="";
    private String nameToken;
    
    private TabItem( int secureCodeID, String icone,String nameToken){
    	secureItemID = secureCodeID;
    	this.icone = icone;
    	this.nameToken =nameToken;
    }
    
    public String getItemTitle(){
        switch(this){
            case patientInfo:return dictionary.info();
            case patientSocial:return dictionary.social();
            case patientMedication:return dictionary.medication();
            case patientAllergy:return dictionary.allergy();
            case patientImmunization:return dictionary.immunization();
            case patientVital:return dictionary.vital();
            default:return "";
        }
    }
    @Override
    public int getSecuredId() {
        return secureItemID;
    }

    public String getIcone() {
        return icone;
    }

    public String getNameToken() {
        return nameToken;
    }

    
    
}
