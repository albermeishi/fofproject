package com.fof.dao;

import java.util.List;

import com.fof.common.standard.Page;
import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.EnterFlow;
@Mapper
public interface EnterFlowMapper extends Page<EnterFlow, EnterFlow> {
	
    int insert(EnterFlow record);
    int insertSelective(EnterFlow record);

    EnterFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterFlow record);

    EnterFlow selectOneByCondition(EnterFlow record);
    List<EnterFlow> selectListByCondition(EnterFlow record);

}