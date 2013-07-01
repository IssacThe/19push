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
    
    @DefaultMessage("Gerer Patients")
    String editPatient();
     
    @DefaultMessage("Gerer Usagers")
    String editUser();
     
    @DefaultMessage("Gerer Roles")
    String editRole();
    
    @DefaultMessage("Nom d''utilisateur")
    String userName();
     
    @DefaultMessage("Mot de passe")
    String password();
    
    @DefaultMessage("Deconnexion pour cause d''inactivite")
    String timeout();
     
    @DefaultMessage("Infos")
    String info();
     
    @DefaultMessage("Antecedents Sociaux")
    String social();
     
    @DefaultMessage("Medications")
    String medication();
    
    @DefaultMessage("Allergies")
    String allergy();
    
    @DefaultMessage("Immunisations")
    String immunization();

    @DefaultMessage("Signes Vitaux")
    String vital();

    @DefaultMessage("Ajouter un Patient")
    String addPatient();

    @DefaultMessage("Prendre une Note")
    String addNote();

    @DefaultMessage("Gerer Mon Compte")
    String manageAccount();

    @DefaultMessage("Gerer Le Systeme")
    String manageSystem();

    @DefaultMessage("Nom ")
    String lastName();
    
    @DefaultMessage("Prenom")
    String firstName();
    

    @DefaultMessage("Deuxieme Prenom")
    String middleName();

    @DefaultMessage("Date de Naissance")
    String dob();

    @DefaultMessage("Lieu de Naissance")
    String pob();
    
    @DefaultMessage("Sexe")
    String sex();

    @DefaultMessage("Le champ '' {0}'' ne doit pas etre vide.")
    String shouldNotBeEmpty(String lastName);
    
    @DefaultMessage("La '' {0}'' doit etre anterieure a la date d''aujourd''hui .")
    String shouldBeForeToday(String dob);

    @DefaultMessage("Homme")
    String man();

    @DefaultMessage("Femme")
    String woman();

    @DefaultMessage("Matricule du Patient ")
    String patientId();
}
