package com.example.springmvc1.web.frontcontroller.v5;

import com.example.springmvc1.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    boolean supports(final Object handler);

    ModelView handle(final HttpServletRequest request, final HttpServletResponse response,
                     final Object handler) throws ServletException, IOException;
}
