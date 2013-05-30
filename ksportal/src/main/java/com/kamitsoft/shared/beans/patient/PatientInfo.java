package com.kamitsoft.shared.beans.patient;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gwt.user.client.rpc.IsSerializable;

@Entity 
@Table(name="patient")
public class PatientInfo implements IsSerializable{
	private String firstName;
	private String lastName;
	private long patientID;

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
}
