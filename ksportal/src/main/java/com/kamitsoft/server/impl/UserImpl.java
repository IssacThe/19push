package com.kamitsoft.server.impl;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.kamitsoft.server.core.user.User;
import com.kamitsoft.shared.beans.user.UserInfo;
import com.kamitsoft.shared.beans.user.UserParameters;

@Singleton
public class UserImpl extends RemoteServiceServlet implements com.kamitsoft.remote.rpc.User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject private User user;
	
	@Override
	public UserInfo login(UserParameters params) throws Exception {

		return user.login(params.getAccountName(), params.getUserName(), params.getPassword());
	}

}

