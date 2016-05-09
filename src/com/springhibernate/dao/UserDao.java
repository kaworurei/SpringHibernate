package com.springhibernate.dao;

import com.springhibernate.model.models.UserVO;

/**
 * Created by Administrator on 2016/5/9.
 */
public interface UserDao {
    public UserVO findByUserId(String id);
}
