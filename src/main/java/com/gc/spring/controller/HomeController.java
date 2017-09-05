package com.gc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Steve on 7/21/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("homepage", "message", "Hello World");
    }

    @RequestMapping("/gotologin")
    public ModelAndView goToLogin(){
        return new ModelAndView("login","","");
    }

    @RequestMapping("/login")
    public ModelAndView login(){

        return new ModelAndView("profile","","");

    }

}

