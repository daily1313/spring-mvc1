package com.example.springmvc1.web.frontcontroller.v3;

import com.example.springmvc1.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(final Map<String, String> paramMap);
}
