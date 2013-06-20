package com.kamitsoft.shared.beans.patient;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.kamitsoft.client.ui.person.HasPersonInfo;
import com.kamitsoft.shared.beans.BeanInfo;

@Entity 
@Table(name="patient")
public class PatientInfo extends BeanInfo implements IsSerializable, HasPersonInfo{
    private long accountID;
    private long patientID;
    private String firstName;
    private String middleName;
    private String lastName;
    private Timestamp dob;
    private String    pob;		 
    private String sex;	       
    
    
    public Timestamp getDob() {
        return dob;
    }
    public void setDob(Timestamp dob) {
        this.dob = dob;
    }
    public String getPob() {
        return pob;
    }
    public void setPob(String pob) {
        this.pob = pob;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }
    
    public String getLastName() {
        return lastName ;
    }
    
    @Id @GeneratedValue
    public long getPatientID() {
        return patientID;
    }
    public void setPatientID(long patientID) {
    	this.patientID = patientID;
    }
    public long getAccountID() {
        return accountID;
    }
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
