package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.EnterFlowScore;
@Mapper
public interface EnterFlowScoreMapper {
 
    int insert(EnterFlowScore record);

    int insertSelective(EnterFlowScore record);

    EnterFlowScore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterFlowScore record);
    EnterFlowScore selectOneByCondition(EnterFlowScore record);
    List<EnterFlowScore> selectListByCondition(EnterFlowScore record);
    
    
    
    
    
}