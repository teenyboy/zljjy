package com.wh.zljjy.dao;


import com.wh.zljjy.domain.Policy;
import com.wh.zljjy.domain.PolicyKey;

public interface PolicyMapper {
    int deleteByPrimaryKey(PolicyKey key);

    int insert(Policy record);

    int insertSelective(Policy record);

    Policy selectByPrimaryKey(PolicyKey key);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKey(Policy record);
}