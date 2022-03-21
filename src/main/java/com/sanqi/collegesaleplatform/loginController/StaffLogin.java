package com.sanqi.collegesaleplatform.loginController;

import com.sanqi.collegesaleplatform.entity.User;
import com.sanqi.collegesaleplatform.mapper.LoginMapper;
import com.sanqi.collegesaleplatform.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
@RestController
@RequestMapping("/sanqi")
public class StaffLogin {
    @Autowired
    private LoginService loginService;
    @Autowired
    private LoginMapper loginMapper;


    @GetMapping("/checkLogin")
    public String login(User user, HttpSession session){
        System.out.println("检验登录");
        List<User> login =loginService.checkLogin(user,session);
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
    @GetMapping("/checkData")
    public String checkData(User user){
        System.out.println("data:"+user);
       List<User> contains = loginMapper.contains(user);
       if(contains.size()!=0){
           return "fail";
       }
       return "success";
    }
    @GetMapping("/exitLogin")
    public String exitLogin(HttpSession session){
        session.removeAttribute("username");
        System.out.println("删除session");
        return "index";
    }

}
