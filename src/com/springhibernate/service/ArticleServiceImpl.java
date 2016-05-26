package com.springhibernate.service;

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
    @Resource
    ArticleDao articleDao;

    @Override
    public String getArticleDetailHtml(int id) {
        ArticleVO VO=articleDao.findById(id);
        return null;
    }

    @Override
    public List getArticleListHtml(int currentPage, int pageSize) {
        List list= (List) articleDao.findList(currentPage,pageSize);
        return list;
    }
}
