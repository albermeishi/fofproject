package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.OperateLog;
@Mapper
public interface OperateLogMapper {
 
    int insert(OperateLog record);

    int insertSelective(OperateLog record);

    OperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperateLog record);
    OperateLog selectOneByCondition(OperateLog record);
    List<OperateLog> selectListByCondition(OperateLog record);
    
    
    
}