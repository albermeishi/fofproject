package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.SimuProduct;
@Mapper
public interface SimuProductMapper {
  
    int insert(SimuProduct record);

    int insertSelective(SimuProduct record);

    SimuProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SimuProduct record);
    SimuProduct selectOneByCondition(SimuProduct record);
    List<SimuProduct> selectListByCondition(SimuProduct record);
    
    
    
}