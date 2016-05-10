package com.springhibernate.controller;

import com.springhibernate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/5/9.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String Login(@RequestParam("inputEmail") String id,@RequestParam("inputPassword") String password,@RequestParam("checkbox") String checkbox){
        if(userService.LoginResult(id,password)){
            return "main";
        }else{
            return  "false";
        }
    }
}
