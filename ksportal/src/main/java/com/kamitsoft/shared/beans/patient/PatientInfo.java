package com.kamitsoft.shared.beans.patient;

import com.google.gwt.user.client.rpc.IsSerializable;

public class PatientInfo implements IsSerializable{
	private String firstName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}

}
