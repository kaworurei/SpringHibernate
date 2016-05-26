package com.springhibernate.dao;

import com.springhibernate.model.models.ArticleVO;
import com.springhibernate.model.models.UserVO;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public ArticleVO findById(int id) {
        Session session=sessionFactory.openSession();
        Transaction ts=session.beginTransaction();
        ArticleVO article=null;
        try {
            article= (ArticleVO) session.get(ArticleVO.class,id);
            ts.commit();
        }catch (Exception e){
            ts.rollback();
        }finally {
            try {
                session.close();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
        return article;
    }

    @Override
    public List<ArticleVO> findList(int currentPage, int pageSize) {
        Session session=sessionFactory.openSession();
        Transaction ts=session.beginTransaction();
        List list=null;
        try {

            UserVO user=(UserVO) session.get(UserVO.class,1);

            String sql =" from ArticleVO order by updateTime desc ";
            Query query=session.createQuery(sql);
            query.setFirstResult((currentPage-1)*pageSize);
            query.setMaxResults(pageSize);
            list=query.list();
            for(Object obj:list){
                ArticleVO item=(ArticleVO)obj;
                item.setAuthorid(item.getAuthor().getId());
                item.setAuthorname(item.getAuthor().getUserName());
            }
            ts.commit();
        }catch (Exception e){
            ts.rollback();
        }finally {
            try {
                session.close();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
