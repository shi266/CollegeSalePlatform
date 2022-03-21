package com.sanqi.collegesaleplatform.service;


import com.sanqi.collegesaleplatform.entity.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface LoginService {


    List<User> checkLogin(User user, HttpSession session);

}
