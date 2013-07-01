
package com.kamitsoft.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.kamitsoft.shared.beans.user.UserInfo;

public class UserLogoutEvent extends GwtEvent<UserLogoutEventHandler> {

    public static final Type<UserLogoutEventHandler> TYPE = new Type<UserLogoutEventHandler>();
    
    private UserInfo userInfo;
    
    public UserLogoutEvent(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    public UserInfo getUserInfo() {
        return userInfo;
    }
    
    @Override
    public final Type<UserLogoutEventHandler> getAssociatedType() {
        return TYPE;
    }
    

    
    @Override
    protected void dispatch(UserLogoutEventHandler handler) {
        handler.userDidLoggedOut(this);
    }

}