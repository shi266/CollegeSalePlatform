package com.sanqi.collegesaleplatform.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sanqi")
public class SanQiStaffController {
    @GetMapping("/login")
    public String sanQiStaffLogin(){
        System.out.println("欢迎来到springboot默认页面");
        return "login";
    }

    @GetMapping("/index")
    public String sanQiStaffLogin2(){
        System.out.println("欢迎来到springboot");
        return "index";
    }
    @GetMapping("/test")
    public String  test(){
        System.out.println("欢迎来到springboot");
        return "test";
    }


}
