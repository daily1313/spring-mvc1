package com.example.springmvc1.web.frontcontroller.v3;

import com.example.springmvc1.web.frontcontroller.ModelView;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(final Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
