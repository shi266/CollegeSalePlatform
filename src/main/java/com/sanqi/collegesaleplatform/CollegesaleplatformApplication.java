package com.sanqi.collegesaleplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class CollegesaleplatformApplication {

    public static void main(String[] args) {

        SpringApplication.run(CollegesaleplatformApplication.class, args);
        System.out.println("Spring Demo 启动成功！");
    }

}
