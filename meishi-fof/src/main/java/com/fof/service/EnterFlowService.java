package com.fof.service;

import com.fof.entity.EnterFlow;
import com.fof.common.bean.PageModel;
import com.fof.response.ResponseData;
import com.fof.entity.*;

import java.util.List;

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

    List<EnterFlow> findEnterFlowList(EnterFlow enterFlow);

    /**
     * 准入申请审核通过
     *
     * @param enterFlow
     * @return
     */
    int acceptEnterApply(EnterFlow enterFlow);

    /**
     * 准入申请审核拒绝
     * @param enterFlowDto
     * @return
     */
    int refuseEnterApply(EnterFlowDto enterFlowDto);

    /**
     * 存储公司基础准入资料授权
     * @param enterFlowCompany
     * @return
     */
    int saveEnterFlowCompany(EnterFlowCompany enterFlowCompany);

    /**
     * 存储公司基础准入资料授权
     * @param enterFlowProduct
     * @return
     */
    int saveEnterFlowProduct(EnterFlowProduct enterFlowProduct);
}
