package com.kamitsoft.client.ui.editable;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.kamitsoft.client.core.share.confirmation.Confirmable;



public class EditableSelectBox extends Confirmable implements HasClickHandlers{
    private Label fieldName = new Label();
    private Label lFieldValue = new Label();
    private ListBox lListBox = new ListBox();
    private boolean editing = false;
    private boolean editable = false;
    private boolean valueChanged = false;
    private int valueIndex, lastIndex;
    public void initWithNameValue(String name, int valueIndex,ArrayList<String> items, boolean editable, boolean aligned){
      this.clear();
      addStyleName("displaybloc");
      fieldName.setText(name+":");
      fieldName.setStyleName("displayinline margin-right-5px boldtext");
      
      lListBox.clear();
      lListBox.setStyleName("displayinline editing");
      for(String item:items){
          lListBox.addItem(item);
      }
      
      this.valueIndex = valueIndex;
      lastIndex = valueIndex;
      lFieldValue.setText(lListBox.getItemText(valueIndex));
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
     
      
      lListBox.addBlurHandler(new BlurHandler(){

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
        return lListBox.getItemText(lListBox.getSelectedIndex());
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
            add(lListBox);
            lListBox.setSelectedIndex(lastIndex);
            lListBox.setFocus(true);
            editing=true;
        }
    }
    
    private void displaying(){
        if(editing){
            remove(lListBox);
            add(lFieldValue);
            lastIndex = lListBox.getSelectedIndex();
            lFieldValue.setText(lListBox.getItemText(lastIndex));
            valueChanged = valueIndex !=lastIndex;
            editing = false;
        }
        
    }

    

  

    @Override
    protected void restoreValue() {
        lListBox.setItemSelected(valueIndex, true);
        lListBox.setFocus(true);
        editing=true;
    }

    @Override
    protected int getAbsoluteFieldLeft() {
        return lListBox.getAbsoluteLeft()+lListBox.getOffsetWidth();
        
    }

  

    
}
