package com.springhibernate.controller;

import com.springhibernate.service.UserService;
import com.springhibernate.util.CookieUtil;
import com.springhibernate.util.SessionUtil;
import com.springhibernate.util.ValueCheckUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/5/9.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String Login(HttpServletResponse response, @RequestParam("inputEmail") String id, @RequestParam("inputPassword") String password, @RequestParam("checkbox") String checkbox) {
        if (userService.LoginResult(id, password)) {
            if (checkbox.split(",")[0].equals("true")) {
                CookieUtil.addCookie(response, "userid", id, 30 * 24 * 60 * 60);
            }
            return "main";
        } else {
            return "false";
        }
    }

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String Login(HttpServletRequest request){
        if(SessionUtil.isSessionExist(request,"userid")){
            return "main";
        }else{
            return "false";
        }
    }

    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String Index(HttpServletRequest request) {
        return "index";
    }

}
