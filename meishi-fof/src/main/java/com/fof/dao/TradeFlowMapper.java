package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.TradeFlow;
@Mapper
public interface TradeFlowMapper {
   
    int insert(TradeFlow record);

    int insertSelective(TradeFlow record);

    TradeFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlow record);
    TradeFlow selectOneByCondition(TradeFlow record);
    List<TradeFlow> selectListByCondition(TradeFlow record);
    
}