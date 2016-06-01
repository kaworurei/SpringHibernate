package com.springhibernate.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.springhibernate.dao.ArticleDao;
import com.springhibernate.model.models.ArticleVO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */

@Repository
public class ArticleServiceImpl implements ArticleService {

    private Gson gson;

    @Resource
    ArticleDao articleDao;

    @Override
    public String getArticleDetailHtml(int id) {
        ArticleVO VO=articleDao.findById(id);
        return null;
    }

    @Override
    public List getArticleList(int currentPage, int pageSize, String whereStr) {
        List list= (List) articleDao.findList(currentPage,pageSize,whereStr);
        return list;
    }

    @Override
    public String getArticleListHtml(int currentPage, int pageSize,String whereStr) {
        List list= (List) articleDao.findList(currentPage,pageSize,whereStr);
        return ArticleListToHtml(list);
    }

    @Override
    public String SetArticleEnable(int currentPage, int pageSize, String whereStr, String idStr,boolean enable) {
        List<Integer> list = getGson().fromJson(idStr, new TypeToken<List<Integer>>(){}.getType());
        articleDao.SetArticleEnable(list,enable);
        return getArticleListHtml(currentPage,pageSize,whereStr);
    }

    private class Item{
        public String id;
    }

    private Gson getGson(){
        if(gson==null)
            gson=new Gson();
        return gson;
    }

    private String ArticleListToHtml(List<ArticleVO> list){
        String htmlStr="";
        for(ArticleVO item :list){
            htmlStr+="<tr><th><input type=\"checkbox\" data-articleid=\""+item.getId()+"\"></th>" +
                    "<td><a href=\"javascript:void(0)\" title=\""+item.getContent().substring(0)+"\" class=\"easyui-tooltip\">"+item.getTtile()+"</a></td>"+
                    "<td>"+item.getAuthorname()+"</td>"+
                    "<td>"+item.getUpdateTime()+"</td>";
            if(item.getStatus()==0){
                htmlStr+="<td>启用</td><td><a style=\"color: grey;font-size: 24px\" href=\"javascript:void(0)\"><span class=\"glyphicon glyphicon-stop\" aria-hidden=\"true\"></span></a>";
            }else{
                htmlStr+="<td>停用</td><td><a style=\"color: green;font-size: 24px\" href=\"javascript:void(0)\"><span class=\"glyphicon glyphicon-play\" aria-hidden=\"true\"></span></a>";
            }
            htmlStr+="<a style=\"color: red;font-size: 24px;margin-left: 5px;margin-right: 5px\"  href=\"javascript:void(0)\"><span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span></a></td>"+
                    "</tr>";
        }
        return htmlStr;
    }
}
