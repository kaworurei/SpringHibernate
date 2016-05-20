package com.springhibernate.interceptor;

import com.springhibernate.util.SessionUtil;
import com.springhibernate.util.ValueCheckUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/5/11.
 */
public class AuthorizedInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String uri = request.getRequestURI();
//        String[] noFilters=new String[]{"login"};
//        boolean beFilter = true;
//        for(String noFilter:noFilters){
//            if(uri.contains(noFilter)){
//                beFilter=false;
//                break;
//            }
//        }
//        if(beFilter){
 //       }
        if(SessionUtil.isSessionExist(request,"userid")){
            if(request.getRequestURI().contains("index")){
                //request.getRequestDispatcher("login").forward(request,response);
                response.sendRedirect("main/login");
                return false;
            }
            return true;
        }

        Cookie[] cookies = request.getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userid")) {
                    SessionUtil.addSession(request,"userid",cookie.getValue());
                    response.sendRedirect("main/login");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
