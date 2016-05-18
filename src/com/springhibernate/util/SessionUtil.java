package com.springhibernate.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/5/17.
 */
public class SessionUtil {
    public static boolean isSessionExist(HttpServletRequest request,String name){
        return !ValueCheckUtil.isEmptyString(request.getSession().getAttribute(name));
    }

    public static void addSession(HttpServletRequest request,String name,String value){
        request.getSession().setAttribute(name,value);
    }
    public static Object getSessionValue(HttpServletRequest request,String name){
        return request.getSession().getAttribute(name);
    }
}
