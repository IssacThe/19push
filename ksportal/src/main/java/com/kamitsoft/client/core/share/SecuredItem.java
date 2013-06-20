package com.kamitsoft.client.core.share;

public interface SecuredItem {
    public static final int ITEM_EDIT_PATIENT = 1000;
    public static final int ITEM_EDIT_USER = 1001;
    public static final int ITEM_EDIT_ROLE = 1002;
    
    
    public static final int TAB_PATIENT_INFO = 1100;
    public static final int TAB_PATIENT_SOCIAL = 1101;
    public static final int TAB_PATIENT_MEDICATION = 1102;
    
    
    public int getSecuredId();
}
