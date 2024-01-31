package com.example.springmvc1.web.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public interface Controller {

    ModelAndView handleRequest(final HttpServletRequest request,
                               final HttpServletResponse response) throws Exception;
}
