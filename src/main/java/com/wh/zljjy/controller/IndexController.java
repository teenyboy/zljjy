package com.wh.zljjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "templates/thymeleaf/index";
    }


}
