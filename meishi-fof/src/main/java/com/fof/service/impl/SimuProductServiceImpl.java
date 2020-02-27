package com.fof.service.impl;

import com.fof.common.dtos.rsp.SimuProductRsp;
import com.fof.dao.SimuProductMapper;
import com.fof.entity.SimuProduct;
import com.fof.service.SimuProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 00:57
 * @Description:
 */
@Service
public class SimuProductServiceImpl implements SimuProductService {
   @Autowired SimuProductMapper  simuProductMapper;
   @Override
   public List<SimuProductRsp> querySimuProductsByName(SimuProduct record){
	 return  simuProductMapper.querySimuProductsByName(record) ;
	} 
}
