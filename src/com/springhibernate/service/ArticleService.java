package com.springhibernate.service;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public interface ArticleService {

    String getArticleDetailHtml(int id);

    List getArticleListHtml(int currentPage, int pageSize);
}
