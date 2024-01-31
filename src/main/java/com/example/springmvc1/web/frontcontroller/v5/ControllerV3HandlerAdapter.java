package com.example.springmvc1.web.frontcontroller.v5;

import com.example.springmvc1.web.frontcontroller.ModelView;
import com.example.springmvc1.web.frontcontroller.v3.ControllerV3;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControllerV3HandlerAdapter implements MyHandlerAdapter {

    @Override
    public boolean supports(final Object handler) {
        return (handler instanceof ControllerV3);
    }

    @Override
    public ModelView handle(final HttpServletRequest request,
                            final HttpServletResponse response, final Object handler) throws ServletException, IOException {
        ControllerV3 controller = (ControllerV3) handler;

        Map<String, String> paramMap = createParamMap(request);

        ModelView mv = controller.process(paramMap);
        return mv;
    }

    private Map<String, String> createParamMap(final HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName,
                        request.getParameter(paramName)));
        return paramMap;
    }
}
