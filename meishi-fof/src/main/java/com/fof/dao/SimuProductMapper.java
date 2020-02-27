package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.common.dtos.rsp.FofProductRsp;
import com.fof.common.dtos.rsp.SimuProductRsp;
import com.fof.entity.FofProduct;
import com.fof.entity.SimuProduct;
@Mapper
public interface SimuProductMapper {
  
    int insert(SimuProduct record);

    int insertSelective(SimuProduct record);

    SimuProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SimuProduct record);
    SimuProduct selectOneByCondition(SimuProduct record);
    List<SimuProduct> selectListByCondition(SimuProduct record);
    
    
    /**  
     * @Description:通过名称查询 被投基金信息
     * @author alber
     * @date 2020年2月26日 下午2:30:12  
     */
    List<SimuProductRsp> querySimuProductsByName(SimuProduct record);
    
    
}