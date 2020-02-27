package com.fof.service;

import java.util.List;

import com.fof.common.dtos.rsp.SimuProductRsp;
import com.fof.entity.SimuProduct;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 00:56
 * @Description:
 */
public interface SimuProductService {
	public  List<SimuProductRsp> querySimuProductsByName(SimuProduct record);
}
