package com.kamitsoft.client.core.patient.tab.info;



import java.util.ArrayList;
import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.share.confirmation.Validator;
import com.kamitsoft.client.core.share.constants.DateConstants;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.ui.editable.EditableDate;
import com.kamitsoft.client.ui.editable.EditableSelectBox;
import com.kamitsoft.client.ui.editable.EditableText;
import com.kamitsoft.shared.beans.patient.PatientInfo;


public class PatientInfoView extends ViewImpl implements PatientInfoPresenter.Display {

    
    private final Widget widget;
    @UiField EditableText patientID;
    @UiField EditableText editableFirstName;
    @UiField EditableText editableLastName;
    @UiField EditableText editableMiddleName;
    @UiField EditableDate dob;
    @UiField EditableText pob;
    @UiField EditableSelectBox sex;
    @UiField Image patientPicture;
    private MainDictionary dictionary;
    
    
    public interface Binder extends UiBinder<Widget, PatientInfoView> {}
    
    @Inject
    public PatientInfoView(final Binder binder, MainDictionary dictionary) {
        widget = binder.createAndBindUi(this);
        this.dictionary = dictionary;
       
        
    }


    public Widget asWidget() {
        return  widget;
    }


    @Override
    public void setPatient(PatientInfo patientInfo) { 
        setValidators();
        patientID.initWithNameValue(dictionary.patientId(), String.valueOf(patientInfo.getPatientID()), false, true);
        editableLastName.initWithNameValue(dictionary.lastName(), patientInfo.getLastName(), true, true);
        
        editableLastName.initWithNameValue(dictionary.lastName(), patientInfo.getLastName(), true, true);
        
        
        if(patientInfo.getMiddleName()!= null && patientInfo.getMiddleName().trim().length() > 0){
          
            editableMiddleName.initWithNameValue(dictionary.middleName(),patientInfo.getMiddleName() , false, true);
        }else{
            editableMiddleName.setVisible(false); 
        }
        editableFirstName.initWithNameValue(dictionary.firstName(), patientInfo.getFirstName(), true, true);
        
        DateTimeFormat df = DateTimeFormat.getFormat(DateConstants.DDMMYYYY);
        dob.initWithNameValue(dictionary.dob(), df.format(patientInfo.getDob()), true, true);
        
        pob.initWithNameValue(dictionary.pob(), patientInfo.getPob().toString(), false, true);
        
        ArrayList<String> items = new ArrayList<String>(); 
        items.add(dictionary.man());
        items.add(dictionary.woman());
        sex.initWithNameValue(dictionary.sex(), (patientInfo.getSex().toString().equals("M"))? 0:1, items,true, true);
        patientPicture.setUrl(patientInfo.getPictureUrl());
    }


    private void setValidators() {
        
        editableLastName.addValidator(new Validator(dictionary.shouldNotBeEmpty(dictionary.lastName()), true){
            public boolean validate(){
                return editableLastName.getNewText() !=null && editableLastName.getNewText().trim().length() > 0;
            }
        });
        
        editableFirstName.addValidator(new Validator(dictionary.shouldNotBeEmpty(dictionary.firstName()), true){
            public boolean validate(){
                return editableFirstName.getNewText() !=null && editableFirstName.getNewText().trim().length() > 0;
            }
        });
        
        
        dob.addValidator(new Validator(dictionary.shouldNotBeEmpty(dictionary.dob()), true){
            public boolean validate(){
                return dob.getNewText() !=null && dob.getNewText().trim().length() > 0;
            }
        });
        dob.addValidator(new Validator(dictionary.shouldBeForeToday(dictionary.dob()), true){
            public boolean validate(){
                DateTimeFormat df = DateTimeFormat.getFormat(DateConstants.DDMMYYYY);
                return dob.getNewText() !=null && df.parse(dob.getNewText()).compareTo(new Date()) <= 0;
            }
        });
    }


}