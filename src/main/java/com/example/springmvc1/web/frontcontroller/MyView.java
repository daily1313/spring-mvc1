package com.example.springmvc1.web.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

public class MyView {

    private String viewPath;

    public MyView(final String viewPath) {
        this.viewPath = viewPath;
    }

    public void render(final HttpServletRequest request,
                       final HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }

    public void render(final Map<String, Object> model,
                       final HttpServletRequest request,
                       final HttpServletResponse response) throws ServletException, IOException {
        modelToRequestAttribute(model, request);
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }

    private void modelToRequestAttribute(final Map<String, Object> model, final HttpServletRequest request) {
        model.forEach((key, value) -> request.setAttribute(key, value));
    }
}
