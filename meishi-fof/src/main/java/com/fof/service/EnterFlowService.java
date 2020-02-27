package com.fof.service;

import com.fof.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:57
 * @Description:
 */
public interface EnterFlowService {

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
