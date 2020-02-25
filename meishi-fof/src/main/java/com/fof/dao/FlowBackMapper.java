package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FlowBack;
@Mapper
public interface FlowBackMapper {
    int insert(FlowBack record);

    int insertSelective(FlowBack record);

    FlowBack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlowBack record);

    FlowBack selectOneByCondition(FlowBack record);
    List<FlowBack> selectListByCondition(FlowBack record);
    
    
    
}