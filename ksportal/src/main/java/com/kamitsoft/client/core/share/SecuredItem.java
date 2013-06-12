package com.kamitsoft.client.core.share;

public interface SecuredItem {
	public static final int ITEM_EDIT_PATIENT = 1000;
	public static final int ITEM_EDIT_USER = 1001;
	public static final int ITEM_EDIT_ROLE = 1002;
	
	public int getSecuredId();
}
