package com.kamitsoft.client.ui.editable;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.kamitsoft.client.core.share.confirmation.Confirmable;



public class EditableText extends Confirmable implements HasClickHandlers{
    private Label fieldName = new Label();
    private Label lFieldValue = new Label();
    private TextBox lTextBox = new TextBox();
    private boolean editing = false;
    private boolean editable = false;
    private boolean valueChanged = false;
    private String value;
    public void initWithNameValue(String name, String value, boolean editable, boolean aligned){
      this.clear();
      addStyleName("displaybloc");
      fieldName.setText(name+":");
      fieldName.setStyleName("displayinline margin-right-5px boldtext");
      
      this.value = value;
      lFieldValue.setText(value);
      lFieldValue.setStyleName("displayinline");
      lFieldValue.addClickHandler(new ClickHandler(){

        @Override
        public void onClick(ClickEvent event) {
            editing();
            
        }});
      
      
      
      add(fieldName);
      add(lFieldValue);
      
      if(aligned){
          setCellWidth(fieldName, "150px");
      }
     
      lTextBox.setStyleName("displayinline editing");
      lTextBox.addBlurHandler(new BlurHandler(){

        @Override
        public void onBlur(BlurEvent event) {
            
            if(onBlurValidate()){
                displaying();
            }
           
        }});
      setEditable(editable);
      
    }
    
    public String getText(){
        return lFieldValue.getText();
    }
   
    public String getNewText(){
        return lTextBox.getText();
    }
    public boolean didChanged(){
        return valueChanged;
    }
    
    @UiFactory
    public  void setEditable(boolean b) {
        if(b){
            lFieldValue.addStyleName("cursorpointer");
        }else{
            lFieldValue.removeStyleName("cursorpointer");
        }
        editable = b;
    }

    @Override
    public HandlerRegistration addClickHandler(final ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

    private void editing(){
        if(editable){
            remove(lFieldValue);
            add(lTextBox);
            lTextBox.setText(lFieldValue.getText());
            lTextBox.setFocus(true);
            editing=true;
        }
    }
    
    private void displaying(){
        if(editing){
            remove(lTextBox);
            add(lFieldValue);
            lFieldValue.setText(lTextBox.getText());
            valueChanged = !value.equals(lTextBox.getText());
            editing = false;
        }
        
    }

    

  

    @Override
    protected void restoreValue() {
        lTextBox.setText(lFieldValue.getText());
        lTextBox.setFocus(true);
        editing=true;
    }

    @Override
    protected int getAbsoluteFieldLeft() {
        return lTextBox.getAbsoluteLeft()+lTextBox.getOffsetWidth();
        
    }

  

    
}
