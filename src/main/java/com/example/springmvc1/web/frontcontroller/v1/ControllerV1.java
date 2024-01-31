package com.example.springmvc1.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {

    void process(final HttpServletRequest request,
                 final HttpServletResponse response) throws ServletException, IOException;
}
