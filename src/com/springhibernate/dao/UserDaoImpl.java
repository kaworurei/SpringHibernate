package com.springhibernate.dao;

import com.springhibernate.model.models.UserVO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        try {
            Query query=session.createQuery(" from UserVO where userId = ?");
            query.setParameter(0,id);
            List<UserVO> result= (List<UserVO>) query.list();
            if(result.size()==1)
                return result.get(0);
            else{
                return null;
            }
        }finally {
            session.close();
        }
    }
}
