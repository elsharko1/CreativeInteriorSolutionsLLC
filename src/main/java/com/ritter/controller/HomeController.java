package com.ritter.controller;

/**
 * Created by Mark on 7/21/2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","greeting","Welcome page");
    }

    @RequestMapping("/page2")

    public ModelAndView page2()
    {
        return new
                ModelAndView("homepage","greeting2","Home page");
    }
    @RequestMapping("/page3")

    public String contactpage(){

        return "contactpage";
    }
}
