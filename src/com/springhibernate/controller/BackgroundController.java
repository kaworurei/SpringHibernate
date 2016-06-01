package com.springhibernate.controller;

import com.springhibernate.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/5/30.
 */
@Controller
@RequestMapping(value = "/background")
public class BackgroundController {

    @Resource
    ArticleService articleService;

    @RequestMapping(value = "index")
    public String Index(){
        return "background/index";
    }

    @RequestMapping(value = "articleslist")
    public ModelAndView articlesList(HttpServletRequest request){
        int currentPage=ServletRequestUtils.getIntParameter(request,"page",1);
        int pageSize=ServletRequestUtils.getIntParameter(request,"pagesize",10);
        String htmlStr=articleService.getArticleListHtml(currentPage,pageSize,"");

        ModelAndView model=new ModelAndView();
        model.setViewName("background/articlelist");
        model.addObject("tablehtml",htmlStr);
        return model;
    }

    @RequestMapping(value="articledisable",produces = {"plain/text; charset=UTF-8"})
    public @ResponseBody String articlesEnsable(HttpServletRequest request){
        String id= ServletRequestUtils.getStringParameter(request, "id", null);
        boolean eanable=ServletRequestUtils.getBooleanParameter(request, "enable", true);
        int currentPage=ServletRequestUtils.getIntParameter(request,"page",1);
        int pageSize=ServletRequestUtils.getIntParameter(request,"pagesize",10);
        return articleService.SetArticleEnable(currentPage,pageSize,"",id,eanable);
    }


}
