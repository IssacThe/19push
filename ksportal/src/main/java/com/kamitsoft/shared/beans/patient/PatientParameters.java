package com.kamitsoft.shared.beans.patient;
import com.google.gwt.user.client.rpc.IsSerializable;
public class PatientParameters implements IsSerializable{
    private String freeText; 
    private long accountID;
    private long patientID;
    
    public void setFreeText(String searchText) {
     freeText = searchText ;
    }
    public String getFreeText() {
        return freeText;
    }
    public long getAccountID() {
        return accountID;
    }
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }
    public long getPatientID() {
        return patientID;
    }
    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }
    public void clearParameters() {
        accountID = 0L;
        patientID = 0L;
        freeText=null;
    }

}
