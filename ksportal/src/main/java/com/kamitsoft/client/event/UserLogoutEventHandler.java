
package com.kamitsoft.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface UserLogoutEventHandler extends EventHandler {

    void userDidLoggedOut(UserLogoutEvent event);

}
