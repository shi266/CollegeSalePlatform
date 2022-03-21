package com.sanqi.collegesaleplatform.service.impl;

import com.sanqi.collegesaleplatform.entity.User;
import com.sanqi.collegesaleplatform.mapper.LoginMapper;
import com.sanqi.collegesaleplatform.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;


    @Override
    public List<User> checkLogin(User user, HttpSession session) {

        List<User> login =loginMapper.checkLogin(user);
        System.out.println("设置session");
            session.setAttribute("username",user);
        return login;
    }
}
