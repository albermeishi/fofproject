package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.TradeFlowRemit;
@Mapper
public interface TradeFlowRemitMapper {
 
    int insert(TradeFlowRemit record);

    int insertSelective(TradeFlowRemit record);

    TradeFlowRemit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlowRemit record);
    TradeFlowRemit selectOneByCondition(TradeFlowRemit record);
    List<TradeFlowRemit> selectListByCondition(TradeFlowRemit record);
    
    
}