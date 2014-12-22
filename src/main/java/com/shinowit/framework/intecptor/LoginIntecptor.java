package com.shinowit.framework.intecptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/22.
 */
public class LoginIntecptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();

        if ((uri.endsWith("/login")) || (uri.endsWith("/html/login.html"))) {
            return true;
        }
        HttpSession session = request.getSession();
        if ((session == null) || (session.getAttribute("user") == null)) {
            response.sendRedirect("/html/login.html");
            return false;
        } else {
            return true;
        }

    }
}
