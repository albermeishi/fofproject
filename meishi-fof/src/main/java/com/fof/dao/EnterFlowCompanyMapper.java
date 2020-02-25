package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.EnterFlowCompany;
@Mapper
public interface EnterFlowCompanyMapper {
    int insert(EnterFlowCompany record);

    int insertSelective(EnterFlowCompany record);

    EnterFlowCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterFlowCompany record);

   
   
    EnterFlowCompany selectOneByCondition(EnterFlowCompany record);
    List<EnterFlowCompany> selectListByCondition(EnterFlowCompany record);
    
    
    
}