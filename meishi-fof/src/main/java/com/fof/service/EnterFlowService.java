package com.fof.service;

import com.fof.entity.EnterFlow;
import com.fof.common.bean.PageModel;
import com.fof.response.ResponseData;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:57
 * @Description:
 */
public interface EnterFlowService {

    /**
     * 分页查询被投产品池管理列表
     */
    public ResponseData getPage(PageModel<EnterFlow> searchForm);
}
