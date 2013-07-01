package com.kamitsoft.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.MainPageView;
import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter;
import com.kamitsoft.client.core.bars.bottombar.BottomBarView;

import com.kamitsoft.client.core.bars.topbar.TopBarPresenter;
import com.kamitsoft.client.core.bars.topbar.TopBarView;
import com.kamitsoft.client.core.bars.topbar.listpopup.PatientListPopupPresenter;
import com.kamitsoft.client.core.bars.topbar.listpopup.PatientListPopupView;
import com.kamitsoft.client.core.login.popuplogin.LoginPopupPresenter;
import com.kamitsoft.client.core.login.popuplogin.LoginPopupView;
import com.kamitsoft.client.core.login.welcomelogin.WelcomeLoginPresenter;
import com.kamitsoft.client.core.login.welcomelogin.WelcomeLoginView;
import com.kamitsoft.client.core.patient.PatientMainPresenter;
import com.kamitsoft.client.core.patient.PatientMainView;
import com.kamitsoft.client.core.patient.tab.allergy.PatientAllergyPresenter;
import com.kamitsoft.client.core.patient.tab.allergy.PatientAllergyView;
import com.kamitsoft.client.core.patient.tab.immunization.PatientImmunizationPresenter;
import com.kamitsoft.client.core.patient.tab.immunization.PatientImmunizationView;
import com.kamitsoft.client.core.patient.tab.info.PatientInfoPresenter;
import com.kamitsoft.client.core.patient.tab.info.PatientInfoView;
import com.kamitsoft.client.core.patient.tab.medication.PatientMedicationPresenter;
import com.kamitsoft.client.core.patient.tab.medication.PatientMedicationView;
import com.kamitsoft.client.core.patient.tab.social.PatientSocialPresenter;
import com.kamitsoft.client.core.patient.tab.social.PatientSocialView;
import com.kamitsoft.client.core.patient.tab.vitals.PatientVitalsPresenter;
import com.kamitsoft.client.core.patient.tab.vitals.PatientVitalsView;
import com.kamitsoft.client.places.KSAPlaceManager;

public class BinderModule extends AbstractPresenterModule {

    @Override
    protected void configure() {  
        install(new DefaultModule(KSAPlaceManager.class));
    
        // Presenters
        bindPresenter(MainPagePresenter.class, MainPagePresenter.Display.class, MainPageView.class,  MainPagePresenter.Proxy.class);
        bindPresenter(PatientMainPresenter.class, PatientMainPresenter.Display.class, PatientMainView.class, PatientMainPresenter.Proxy.class);
        bindPresenter(WelcomeLoginPresenter.class, WelcomeLoginPresenter.Display.class, WelcomeLoginView.class, WelcomeLoginPresenter.Proxy.class);
        bindPresenter(PatientInfoPresenter.class, PatientInfoPresenter.Display.class, PatientInfoView.class,PatientInfoPresenter.Proxy.class);
        bindPresenter(PatientAllergyPresenter.class, PatientAllergyPresenter.Display.class, PatientAllergyView.class,PatientAllergyPresenter.Proxy.class);
        bindPresenter(PatientVitalsPresenter.class, PatientVitalsPresenter.Display.class, PatientVitalsView.class,PatientVitalsPresenter.Proxy.class);
        bindPresenter(PatientImmunizationPresenter.class, PatientImmunizationPresenter.Display.class, PatientImmunizationView.class,PatientImmunizationPresenter.Proxy.class);
        bindPresenter(PatientMedicationPresenter.class, PatientMedicationPresenter.Display.class, PatientMedicationView.class,PatientMedicationPresenter.Proxy.class);
        bindPresenter(PatientSocialPresenter.class, PatientSocialPresenter.Display.class, PatientSocialView.class,PatientSocialPresenter.Proxy.class);
       
        // widigets
        bindPresenterWidget(TopBarPresenter.class, TopBarPresenter.Display.class, TopBarView.class);
        bindPresenterWidget(BottomBarPresenter.class, BottomBarPresenter.Display.class, BottomBarView.class);
        bindPresenterWidget(LoginPopupPresenter.class, LoginPopupPresenter.Display.class, LoginPopupView.class);
        bindPresenterWidget(PatientListPopupPresenter.class, PatientListPopupPresenter.Display.class, PatientListPopupView.class);
        

    }
}