package com.springhibernate.model.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/11.
 */
@Entity
@Table(name = "LoginMsg", schema = "", catalog = "")
public class LoginMsgVO {
    private int id;
    private int userId;
    private String loginIp;
    private String uuId;
    private String loginDataTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UserId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LoginIP")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "UUId")
    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginMsgVO that = (LoginMsgVO) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;
        if (uuId != null ? !uuId.equals(that.uuId) : that.uuId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (uuId != null ? uuId.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "LoginDataTime")
    public String getLoginDataTime() {
        return loginDataTime;
    }

    public void setLoginDataTime(String loginDataTime) {
        this.loginDataTime = loginDataTime;
    }
}
