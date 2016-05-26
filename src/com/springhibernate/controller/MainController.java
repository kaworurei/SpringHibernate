package com.springhibernate.controller;

import com.springhibernate.model.models.ArticleVO;
import com.springhibernate.service.ArticleService;
import com.springhibernate.service.UserService;
import com.springhibernate.util.CookieUtil;
import com.springhibernate.util.SessionUtil;
import com.springhibernate.util.ValueCheckUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/5/9.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @Resource
    UserService userService;

    @Resource
    ArticleService articleService;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public ModelAndView Login(HttpServletResponse response, @RequestParam("inputEmail") String id, @RequestParam("inputPassword") String password, @RequestParam("checkbox") String checkbox) {
        ModelAndView model=new ModelAndView();
        if (userService.LoginResult(id, password)) {
            if (checkbox.split(",")[0].equals("true")) {
                CookieUtil.addCookie(response, "userid", id, 30 * 24 * 60 * 60);
            }
            List<ArticleVO> list=articleService.getArticleListHtml(1,10);
            model.setViewName("nav");
            model.addObject("article",list);
        } else {
            model.setViewName("false");
        }
        return model;
    }

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public ModelAndView Login(HttpServletRequest request){
        ModelAndView model=new ModelAndView();
        if(SessionUtil.isSessionExist(request,"userid")){
            List<ArticleVO> list=articleService.getArticleListHtml(1,10);
            model.setViewName("nav");
            model.addObject("article",list);
        }else{
            model.setViewName("false");
        }
        return model;
    }

    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String Index(HttpServletRequest request) {
        return "index";
    }

}
