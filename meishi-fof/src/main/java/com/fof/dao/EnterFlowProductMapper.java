package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.EnterFlowProduct;
@Mapper
public interface EnterFlowProductMapper {

    int insert(EnterFlowProduct record);

    int insertSelective(EnterFlowProduct record);

    EnterFlowProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterFlowProduct record);
  
    EnterFlowProduct selectOneByCondition(EnterFlowProduct record);
    List<EnterFlowProduct> selectListByCondition(EnterFlowProduct record);
    
    
    
}