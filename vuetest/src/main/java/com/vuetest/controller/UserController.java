package com.vuetest.controller;

import com.vuetest.pojo.User;
import com.vuetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String hello(){
        return "vue4";
    }
    @RequestMapping("getAll")
    @ResponseBody
    public HashMap<String,Object>  getAll(){
        List<User>  list= userService.getAll();
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("status",0);
        map.put("message",list);
        return map;
    }
    @RequestMapping("find")
    public List<User>  find(){
        return userService.find();
    }
}
