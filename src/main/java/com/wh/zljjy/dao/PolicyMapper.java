package com.wh.zljjy.dao;

import com.wh.zljjy.domain.Policy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PolicyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Policy record);

    int insertSelective(Policy record);

    Policy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKey(Policy record);

    @Select("SELECT * FROM policy limit 10")
    List<Policy> getPolicies();
}