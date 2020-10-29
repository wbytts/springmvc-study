package com.by.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-10 4:43
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello MVC");
        mv.setViewName("hello"); // WEB-INF/jsp/hello.jsp
        return mv;
    }
}
