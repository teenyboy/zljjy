package com.wh.zljjy.controller;

import com.wh.zljjy.domain.Policy;
import com.wh.zljjy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(value = "/policy",method = {RequestMethod.GET,RequestMethod.POST})
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @ResponseBody
    @RequestMapping(value = "/queryPolicy")
    public List<Policy> queryPolicy(){
        List<Policy> policies = policyService.queryPolicies();
        return policies;
    }
}
