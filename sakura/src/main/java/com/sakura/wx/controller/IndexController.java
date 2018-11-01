package com.sakura.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {


    @RequestMapping("/init.action")
    public String init(HashMap<String, Object> map)
    {
        map.put("hello", "This is a very long and good life. ");
        return "/index";
    }

    @RequestMapping(value = "index.action", method = RequestMethod.GET)
    public Map<String,String> getCity()
    {
        Map<String,String> map = new HashMap<>();
        map.put("111","1111");
        return map;
    }


}
