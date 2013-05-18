package com.kamitsoft.shared.beans;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author ftoure
 *
 */

public class StudenttInfo implements IsSerializable{
	private int etudiantID;
	private String etudiantFirstName;
	private String etudiantLastName;
	private boolean sex;
	
	
	public String getClientFirstName() {
		return etudiantFirstName;
	}
	public void setClientFirstName(String firstName) {
		this.etudiantFirstName = firstName;
	}
	public String getClientLastName() {
		return etudiantLastName;
	}
	public void setClientLastName(String lastName) {
		this.etudiantLastName = lastName;
	}

	public boolean isSexe() {
		return sex;
	}
	public void setSexe(boolean sex) {
		this.sex = sex;
	}

	
	public void setClientID(int clientID) {
		this.etudiantID = clientID;
	}
	public int getClientID() {
		return etudiantID;
	}

}
