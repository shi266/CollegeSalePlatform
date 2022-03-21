package com.sanqi.collegesaleplatform.mapper;


import com.sanqi.collegesaleplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    List<User> checkLogin(User user);
    List<User> contains(User user);
    boolean register(User user);
}
