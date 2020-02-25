package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.TradeFlowReal;

@Mapper
public interface TradeFlowRealMapper {
  
    int insert(TradeFlowReal record);

    int insertSelective(TradeFlowReal record);

    TradeFlowReal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlowReal record);
    
    TradeFlowReal selectOneByCondition(TradeFlowReal record);
    List<TradeFlowReal> selectListByCondition(TradeFlowReal record);
    
    
}