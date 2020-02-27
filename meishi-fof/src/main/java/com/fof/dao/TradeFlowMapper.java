package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fof.common.dtos.rsp.UserRsp;
import com.fof.entity.TradeFlow;
@Mapper
public interface TradeFlowMapper {
   
    long insert(TradeFlow record);

    long insertSelective(TradeFlow record);

    TradeFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFlow record);
    TradeFlow selectOneByCondition(TradeFlow record);
    List<TradeFlow> selectListByCondition(TradeFlow record);
   
}