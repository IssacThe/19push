package com.kamitsoft.client.security;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserContext implements IsSerializable{
	private long userID;
	private long accountID;
	public long getAccountID() {
		return accountID;
	}

}
