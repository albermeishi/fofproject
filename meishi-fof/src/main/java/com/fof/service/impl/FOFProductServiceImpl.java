package com.fof.service.impl;

import com.fof.common.dtos.rsp.FofProductRsp;
import com.fof.dao.FofProductMapper;
import com.fof.dao.UserMapper;
import com.fof.entity.FofProduct;
import com.fof.service.FOFProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/24 17:41
 * @Description:
 */
@Service
public class FOFProductServiceImpl implements FOFProductService {
	 
	@Autowired
	private FofProductMapper fofProductMapper;
	
	/**  
	 * @Description:通过fof基金名称查询基金数据
	 * @author alber
	 * @date 2020年2月26日 下午2:18:17  
	 */
	@Override
	public  List<FofProductRsp> queryfofProductsByName(FofProduct record){
	  return	fofProductMapper.queryfofProductsByName(record);
	 }

}
