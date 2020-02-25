package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.User;
@Mapper
public interface UserMapper {
   
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(User record);
    User selectOneByCondition(User record);
    List<User> selectListByCondition(User record);
    
    
    
}