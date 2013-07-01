package com.kamitsoft.client.core.share.confirmation;



public abstract class Validator {
    private String message;
    private  boolean onBlurconfirm = false;
    public Validator(String msg, boolean onBlurconfirm) {
        message = msg;
        this.onBlurconfirm = onBlurconfirm;
    }

    public abstract boolean validate();
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean needLiveConfirm(){
        return onBlurconfirm;
    }

}
