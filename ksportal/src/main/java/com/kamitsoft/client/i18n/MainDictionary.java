package com.kamitsoft.client.i18n;

import com.google.gwt.i18n.client.Messages;

public interface MainDictionary extends Messages{
	
	 @DefaultMessage("Saisir le nom du patient")
	 String patientSearchPlaceHolder();
	 
	 @DefaultMessage("Le nom d''utilisateur ou le mot de passe saisi est invalide")
	 String invalidUserNameOrPassword();

	 @DefaultMessage("L''id de l''account saisi est trop cours. Il faut au moins 5 caracteres")
	 String accountIDTooShort();

	 @DefaultMessage("Le nom d''utilisateur saisi est trop cours Il faut au moins 4 caracteres")
	 String userIDTooShort();

	 @DefaultMessage("Le mot de passe saisi est trop cours Il faut au moins 4 caracteres")
	 String passwordTooShort();
}
