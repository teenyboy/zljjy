package com.wh.zljjy.service.impl;

import com.wh.zljjy.dao.PolicyMapper;
import com.wh.zljjy.domain.Policy;
import com.wh.zljjy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyMapper policyMapper;

    @Override
    public List<Policy> queryPolicies() {
        return policyMapper.queryPolicies();
    }
}
