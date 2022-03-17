package com.sanqi.collegesaleplatform.controller;

import com.sanqi.collegesaleplatform.entity.User;
import com.sanqi.collegesaleplatform.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/sanqi")
public class StaffLogin {
    @Autowired
    private LoginMapper loginMapper;


    @GetMapping("/checkLogin")
    public String login(User user){
        System.out.println("检验登录");
        List<User> login =loginMapper.checkLogin(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(login.size());
        if(login.size()!=0){
            return "success";
        }else {
            return "用户名或密码错误";
        }
    }
    @GetMapping("/register")
    public String register(User user){
        boolean registerStatus = loginMapper.register(user);
        if(registerStatus){
            return "success";
        }else {
            return "注册失败";
        }
    }


}
