package com.fof.service;

import java.util.List;

import com.fof.common.dtos.rsp.FofProductRsp;
import com.fof.entity.FofProduct;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/24 17:42
 * @Description:
 */
public interface FOFProductService {
   public  List<FofProductRsp> queryfofProductsByName(FofProduct record);
}
