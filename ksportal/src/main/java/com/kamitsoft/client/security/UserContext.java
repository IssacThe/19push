package com.kamitsoft.client.security;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserContext implements IsSerializable{
	private long userID;
	private long accountID;
	private boolean connected;
	
	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	public long getAccountID() {
		return accountID;
	}
	public boolean isConnected() {
		return connected;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}

}
