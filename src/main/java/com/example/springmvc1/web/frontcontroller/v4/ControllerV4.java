package com.example.springmvc1.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    String process(final Map<String, String> paramMap, Map<String, Object> model);
}
