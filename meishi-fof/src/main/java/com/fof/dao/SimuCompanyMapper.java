package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.SimuCompany;
@Mapper
public interface SimuCompanyMapper {
 
    int insert(SimuCompany record);

    int insertSelective(SimuCompany record);

    SimuCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SimuCompany record);
    SimuCompany selectOneByCondition(SimuCompany record);
    List<SimuCompany> selectListByCondition(SimuCompany record);
    
    
    
}