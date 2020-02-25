package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FofCompany;
@Mapper
public interface FofCompanyMapper {

    int insert(FofCompany record);

    int insertSelective(FofCompany record);

    FofCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FofCompany record);

    FofCompany selectOneByCondition(FofCompany record);
    List<FofCompany> selectListByCondition(FofCompany record);
    
    
    
    
}