package com.sakura.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping(value = "index.action", method = RequestMethod.GET)
    public Map<String,String> getCity()
    {
        Map<String,String> map = new HashMap<>();
        map.put("111","1111");
        return map;
    }
}
