package com.sanqi.collegesaleplatform.Interceptor;

import com.sanqi.collegesaleplatform.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            User user = (User) request.getSession().getAttribute("username");
            if(user!=null){
                System.out.println("Session存在，允许正常操作");
                return true;
            }
            System.out.println("请求被拦截");
            System.out.println("路径："+request.getRequestURI());
            response.sendRedirect("/sanqi/login");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
