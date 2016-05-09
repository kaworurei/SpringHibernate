package com.springhibernate.service;

import com.springhibernate.dao.UserDao;
import com.springhibernate.model.models.UserVO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/5/9.
 */
@Repository
public class UserServiceImpl implements UserService {
    @Resource
    UserDao UserDao;

    @Override
    public boolean LoginResult(String Id,String PassWord) {
        UserVO user=UserDao.findByUserId(Id);
        if(user.getUserPassWord().equals(PassWord)){
            return true;
        }else {
            return false;
        }
    }
}
