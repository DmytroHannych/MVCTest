package com.goit.MVCTest.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestControler {
@RequestMapping(method = RequestMethod.GET,value = "/test")
    public ModelAndView getTest(){
       ModelAndView modelAndView = new ModelAndView("test");
       return modelAndView;
    }
}
