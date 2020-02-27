package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fof.common.dtos.rsp.UserRsp;
import com.fof.entity.Account;
import com.fof.entity.User;
@Mapper
public interface UserMapper {
   
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(User record);
    User selectOneByCondition(User record);
    List<User> selectListByCondition(User record);
    
    @Select("SELECT id,userName FROM user where status=1")
    List<UserRsp> queryUserList();
    
    
}