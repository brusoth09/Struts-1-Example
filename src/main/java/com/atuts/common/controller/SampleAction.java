package com.atuts.common.controller;

import com.atuts.common.form.SampleForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public class SampleAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SampleForm sampleForm = (SampleForm)form;
        sampleForm.setMessage("Hi Welcome to Struts");

        return mapping.findForward("success");
    }
}
