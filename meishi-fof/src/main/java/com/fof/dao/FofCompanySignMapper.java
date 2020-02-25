package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FofCompanySign;

@Mapper
public interface FofCompanySignMapper {
 
    int insert(FofCompanySign record);

    int insertSelective(FofCompanySign record);

    FofCompanySign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FofCompanySign record);
    FofCompanySign selectOneByCondition(FofCompanySign record);
    List<FofCompanySign> selectListByCondition(FofCompanySign record);
    
    
    
}