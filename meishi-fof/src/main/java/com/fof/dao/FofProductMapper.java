package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FofProduct;
@Mapper
public interface FofProductMapper {
  
    int insert(FofProduct record);

    int insertSelective(FofProduct record);

    FofProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FofProduct record);
    FofProduct selectOneByCondition(FofProduct record);
    List<FofProduct> selectListByCondition(FofProduct record);
    
    
    
    
}