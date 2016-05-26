package com.springhibernate.dao;

import com.springhibernate.model.models.ArticleVO;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public interface ArticleDao {
    ArticleVO findById(int id);
    List<ArticleVO> findList(int currentPage, int pageSize);
}
