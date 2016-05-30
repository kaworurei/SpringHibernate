package com.springhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/5/30.
 */
@Controller
@RequestMapping(value = "/background")
public class BackgroundController {

    @RequestMapping(value = "index")
    public String Index(){
        return "background/index";
    }

    @RequestMapping(value = "articleslist")
    public ModelAndView articleslist(){
        ModelAndView model=new ModelAndView();
        model.setViewName("background/articlelist");
        return model;
    }
}
