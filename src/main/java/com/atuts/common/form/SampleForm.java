package com.atuts.common.form;

import org.apache.struts.action.ActionForm;

/**
 * Sample Form
 */
public class SampleForm extends ActionForm{
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;
}
