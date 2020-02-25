package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.fof.entity.TradeFlowImpress;
@Mapper
public interface TradeFlowImpressMapper {
   
    int insert(TradeFlowImpress record);

    int insertSelective(TradeFlowImpress record);

    TradeFlowImpress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlowImpress record);
    TradeFlowImpress selectOneByCondition(TradeFlowImpress record);
    List<TradeFlowImpress> selectListByCondition(TradeFlowImpress record);
    
    
    
    
}