package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.FofMessage;
@Mapper
public interface FofMessageMapper {
	
    int insert(FofMessage record);

    int insertSelective(FofMessage record);

    FofMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FofMessage record);

    FofMessage selectOneByCondition(FofMessage record);
    List<FofMessage> selectListByCondition(FofMessage record);
    
}