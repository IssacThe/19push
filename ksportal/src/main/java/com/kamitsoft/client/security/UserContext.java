package com.kamitsoft.client.security;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.inject.Singleton;
import com.kamitsoft.shared.beans.user.UserInfo;
@Singleton
public class UserContext implements IsSerializable{
	private long userID;
	private long accountID;
	private boolean connected;
	private UserInfo userInfo;
	
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
	
	public void setUserInfo(UserInfo userInfo) {
		userID = userInfo.getUserID();
		accountID = userInfo.getAccountID();
		connected = (userInfo != null) ? true:false;
		this.userInfo = userInfo;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void reset() {
		userID = 0;
		accountID = 0;
		connected = false;
		userInfo = null;
		
	}

}
