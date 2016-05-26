package com.springhibernate.model.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
@Entity
@Table(name = "User", schema = "", catalog = "")
public class UserVO {
    private int id;
    private String userName;
    private String userPassWord;
    private Integer status;
    private List<ArticleVO> articlelist;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "UserPassWord")
    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserVO userVO = (UserVO) o;

        if (id != userVO.id) return false;
        if (userName != null ? !userName.equals(userVO.userName) : userVO.userName != null) return false;
        if (userPassWord != null ? !userPassWord.equals(userVO.userPassWord) : userVO.userPassWord != null)
            return false;
        if (status != null ? !status.equals(userVO.status) : userVO.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassWord != null ? userPassWord.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "author")
    public List<ArticleVO> getArticlelist() {
        return articlelist;
    }

    public void setArticlelist(List<ArticleVO> articlelist) {
        this.articlelist = articlelist;
    }
}
