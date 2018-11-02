package com.sakura.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/sakura")
public class LoginController {


    @RequestMapping(value = "/login.action", method = {RequestMethod.POST})
    public Map<String,String> login(String userName, String passWord)
    {
        Map<String,String> map = new HashMap<>();
        if(userName.equals("Admin") && passWord.equals("admin"))
        {
            map.put("loginStatus","success");
        }
        else
        {
            map.put("loginStatus","error");
        }


        return map;
    }

}
