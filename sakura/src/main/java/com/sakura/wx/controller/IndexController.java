package com.sakura.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sakura")
public class IndexController {


    @RequestMapping("/init.action")
    public String init(HashMap<String, Object> map)
    {
        return "/index";
    }


}
