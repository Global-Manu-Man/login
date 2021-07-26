package com.global.manu.man.home;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class HomeResource {

    //@GetMapping("/login")
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home.html");
        return modelAndView;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/user")
    //@GetMapping("/user")
    public ModelAndView user() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user.html");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin")
    //@GetMapping("/admin")
    public ModelAndView admin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin.html");
        return modelAndView;
    }


}

