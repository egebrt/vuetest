package com.vuetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.vuetest.mapper")
public class VuetestApplication {
    public static void main(String[] args) {
        SpringApplication.run(VuetestApplication.class, args);
    }

}
