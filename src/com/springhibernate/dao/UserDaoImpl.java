package com.springhibernate.dao;

import com.springhibernate.model.models.UserVO;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/5/9.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public UserVO findByUserId(String id) {
        Session session=sessionFactory.openSession();
        Transaction ts=session.beginTransaction();
        try {
            Query query=session.createQuery(" from UserVO where userName = ?");
            query.setParameter(0,id);
            List<UserVO> result= (List<UserVO>) query.list();
            if(result.size()==1)
                return result.get(0);
            else{
                return null;
            }
        }finally {
            try {
                session.close();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
    }
}
