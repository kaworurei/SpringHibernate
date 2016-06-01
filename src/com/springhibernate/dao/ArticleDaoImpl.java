package com.springhibernate.dao;

import com.springhibernate.model.models.ArticleVO;
import com.springhibernate.model.models.UserVO;
import com.springhibernate.util.ValueCheckUtil;
import org.hibernate.*;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public List<ArticleVO> findList(int currentPage, int pageSize,String whereStr) {
        Session session=sessionFactory.openSession();
        Transaction ts=session.beginTransaction();
        List list=null;
        try {
            String sql ="";
            if(ValueCheckUtil.isEmptyString(whereStr)) {
                sql = " from ArticleVO order by updateTime desc ";
            }else {
                sql = " from ArticleVO where" + whereStr + " order by updateTime desc ";
            }
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

    @Override
    public int SetArticleEnable(List list,boolean enable) {
        Session session=sessionFactory.openSession();
        Transaction ts=session.beginTransaction();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            String sql = "update Article set Status=" + (enable ? 0 : 1) + " WHERE id in " + ListToStr(list) + "";
            conn = SessionFactoryUtils.getDataSource(sessionFactory).getConnection();
            stmt = conn.prepareStatement(sql);
            int i = stmt.executeUpdate();
            ts.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            ts.rollback();
        }finally {
            try {
                stmt.close();
                conn.close();
                session.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private String ListToStr(List list){
        String sql="";
        for(Object str:list){
            sql=sql+","+str;
        }
        return "("+sql.substring(1)+")";
    }
}
