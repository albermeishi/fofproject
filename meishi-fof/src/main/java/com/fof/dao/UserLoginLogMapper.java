package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.UserLoginLog;
@Mapper
public interface UserLoginLogMapper {


    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    UserLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginLog record);
    
    UserLoginLog selectOneByCondition(UserLoginLog record);
    List<UserLoginLog> selectListByCondition(UserLoginLog record);
    
}