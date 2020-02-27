package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.common.dtos.rsp.FofProductRsp;
import com.fof.entity.FofProduct;
@Mapper
public interface FofProductMapper {
  
    int insert(FofProduct record);

    int insertSelective(FofProduct record);

    FofProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FofProduct record);
    FofProduct selectOneByCondition(FofProduct record);
    List<FofProduct> selectListByCondition(FofProduct record);
    
    /**  
     * @Description:通过名称查询fof基金数据
     * @author alber
     * @date 2020年2月26日 下午2:12:53  
     */
    List<FofProductRsp> queryfofProductsByName(FofProduct record);
   
    
    
    
    
    
}