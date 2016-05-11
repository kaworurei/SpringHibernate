package com.springhibernate.model.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/9.
 */
@Entity
@Table(name = "User", schema = "", catalog = "")
public class UserVO {
    private int id;
    private String userId;
    private String userPassWord;
    private String userName;
    private Integer status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "UserPassWord")
    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserVO userVO = (UserVO) o;

        if (id != userVO.id) return false;
        if (userId != null ? !userId.equals(userVO.userId) : userVO.userId != null) return false;
        if (userPassWord != null ? !userPassWord.equals(userVO.userPassWord) : userVO.userPassWord != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userPassWord != null ? userPassWord.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
