package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.TradeFlowTransfer;
@Mapper
public interface TradeFlowTransferMapper {
  
    int insert(TradeFlowTransfer record);

    int insertSelective(TradeFlowTransfer record);

    TradeFlowTransfer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlowTransfer record);
    TradeFlowTransfer selectOneByCondition(TradeFlowTransfer record);
    List<TradeFlowTransfer> selectListByCondition(TradeFlowTransfer record);
    
    
    
    
}