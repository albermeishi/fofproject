package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.Trade;
@Mapper
public interface TradeMapper {
    int insert(Trade record);
    int insertSelective(Trade record);
    Trade selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Trade record);
    Trade selectOneByCondition(Trade record);
    List<Trade> selectListByCondition(Trade record);
    
    
}