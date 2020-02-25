package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.EnterFlow;
@Mapper
public interface EnterFlowMapper {
	
    int insert(EnterFlow record);
    int insertSelective(EnterFlow record);

    EnterFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterFlow record);

    EnterFlow selectOneByCondition(EnterFlow record);
    List<EnterFlow> selectListByCondition(EnterFlow record);
    
    
    
}