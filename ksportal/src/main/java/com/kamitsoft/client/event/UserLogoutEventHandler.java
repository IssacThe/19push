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

import com.google.gwt.event.shared.EventHandler;

public interface UserLogoutEventHandler extends EventHandler {

    void userDidLoggedOut(UserLogoutEvent event);

}
