package com.wh.zljjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "ss";
    }


}
