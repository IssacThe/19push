package com.kamitsoft.remote.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kamitsoft.shared.beans.user.UserInfo;
import com.kamitsoft.shared.beans.user.UserParameters;

@RemoteServiceRelativePath("user")
public interface User  extends RemoteService{
    public UserInfo login(UserParameters params) throws Exception;

}
