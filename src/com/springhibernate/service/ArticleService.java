package com.springhibernate.service;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public interface ArticleService {

    String getArticleDetailHtml(int id);

    List getArticleList(int currentPage, int pageSize,String whereStr);

    String getArticleListHtml(int currentPage, int pageSize,String whereStr);

    String SetArticleEnable(int currentPage, int pageSize, String whereStr, String idStr,boolean enable);
}
