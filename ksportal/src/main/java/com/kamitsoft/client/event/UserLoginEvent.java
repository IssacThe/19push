/*
 *
 * Copyright 2012 by Nightingale, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale, Inc.
 *
 * @author David Labbe
 */
package com.kamitsoft.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.kamitsoft.shared.beans.user.UserInfo;

public class UserLoginEvent extends GwtEvent<UserLoginEventHandler> {

    public static final Type<UserLoginEventHandler> TYPE = new Type<UserLoginEventHandler>();
    
    private UserInfo userInfo;
    
    public UserLoginEvent(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    public UserInfo getUserInfo() {
        return userInfo;
    }
    
    @Override
    public final Type<UserLoginEventHandler> getAssociatedType() {
        return TYPE;
    }
    

    
    @Override
    protected void dispatch(UserLoginEventHandler handler) {
        handler.userDidLogged(this);
    }

}