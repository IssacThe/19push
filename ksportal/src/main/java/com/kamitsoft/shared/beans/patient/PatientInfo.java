package com.kamitsoft.shared.beans.patient;

import com.google.gwt.user.client.rpc.IsSerializable;

public class PatientInfo implements IsSerializable{
	private String firstName;
	private String lastName;

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
}
