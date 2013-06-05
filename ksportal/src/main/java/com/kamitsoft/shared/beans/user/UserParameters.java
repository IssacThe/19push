package com.kamitsoft.shared.beans.user;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserParameters implements IsSerializable{
	private String accountName;
	private String userName;
	private String password;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String account) {
		this.accountName = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String userPassword) {
		this.password = userPassword;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}

	
	

}
