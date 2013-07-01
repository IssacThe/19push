package com.kamitsoft.gin;


import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.login.welcomelogin.WelcomeLoginPresenter;
import com.kamitsoft.client.core.patient.PatientMainPresenter;
import com.kamitsoft.client.core.patient.tab.allergy.PatientAllergyPresenter;
import com.kamitsoft.client.core.patient.tab.immunization.PatientImmunizationPresenter;
import com.kamitsoft.client.core.patient.tab.info.PatientInfoPresenter;
import com.kamitsoft.client.core.patient.tab.medication.PatientMedicationPresenter;
import com.kamitsoft.client.core.patient.tab.social.PatientSocialPresenter;
import com.kamitsoft.client.core.patient.tab.vitals.PatientVitalsPresenter;


@GinModules({ BinderModule.class })
public interface KSAPortalGinjector extends Ginjector {
    PlaceManager getPlaceManager();
    EventBus getEventBus();
    AsyncProvider<MainPagePresenter> getMainPagePresenter();
    AsyncProvider<PatientMainPresenter> getPatientMainPresenter();
    AsyncProvider<WelcomeLoginPresenter> getWelcomeLoginPresenter();
    AsyncProvider<PatientInfoPresenter> getPatientInfoPresenter();
    AsyncProvider<PatientAllergyPresenter> getPatientAllergyPresenter();
    AsyncProvider<PatientImmunizationPresenter> getPatientImmunizationPresenter();
    AsyncProvider<PatientMedicationPresenter> getPatientMedicationPresenter();
    AsyncProvider<PatientSocialPresenter> getPatientSocialPresenter();
    AsyncProvider<PatientVitalsPresenter> getPatientVitalsPresenter();

}
