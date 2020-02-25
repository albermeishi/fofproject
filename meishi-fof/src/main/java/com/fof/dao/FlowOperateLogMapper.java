package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FlowOperateLog;
@Mapper
public interface FlowOperateLogMapper {
 
    int insert(FlowOperateLog record);

    int insertSelective(FlowOperateLog record);

    FlowOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlowOperateLog record);
    FlowOperateLog selectOneByCondition(FlowOperateLog record);
    List<FlowOperateLog> selectListByCondition(FlowOperateLog record);
    
    
    
    
}