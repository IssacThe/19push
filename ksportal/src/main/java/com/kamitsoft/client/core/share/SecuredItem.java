package com.kamitsoft.client.core.share;

public interface SecuredItem {
    public static final int ITEM_ADD_PATIENT = 1000;
    public static final int ITEM_ADD_NOTE= 1001;
    public static final int ITEM_APPOINTEMENT= 1002;
    public static final int ITEM_MANAGE_ACCOUNT= 1003;
    public static final int ITEM_MANAGE_SYSTEM = 1099;
    
    
    public static final int TAB_PATIENT_INFO = 1100;
    public static final int TAB_PATIENT_SOCIAL = 1101;
    public static final int TAB_PATIENT_MEDICATION = 1102;
    public static final int TAB_PATIENT_IMMUNIZATION = 1103;
    public static final int TAB_PATIENT_ALLERGY = 1104;
    public static final int TAB_PATIENT_VITAL = 1105;
    
    public int getSecuredId();
}
