package com.fof.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.UserSign;
@Mapper
public interface UserSignMapper {
    
    int insert(UserSign record);

    int insertSelective(UserSign record);

    UserSign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserSign record);
    UserSign selectOneByCondition(UserSign record);
    List<UserSign> selectListByCondition(UserSign record);
}