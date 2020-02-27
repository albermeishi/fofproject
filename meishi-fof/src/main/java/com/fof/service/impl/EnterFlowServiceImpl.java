package com.fof.service.impl;

import com.fof.dao.EnterFlowMapper;
import com.fof.entity.EnterFlow;
import com.fof.common.bean.PageModel;
import com.fof.response.ResponseData;
import com.fof.service.EnterFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:58
 * @Description:
 */
@Service
public class EnterFlowServiceImpl implements EnterFlowService {
    private static final Logger logger = LoggerFactory.getLogger(EnterFlowServiceImpl.class);

    @Autowired
    private EnterFlowMapper enterFlowMapper;

    @Override
    public ResponseData getPage(PageModel<EnterFlow> pageModel) {
        ResponseData result = new ResponseData();
        Integer count = enterFlowMapper.getCount(pageModel.getSearch());
        List<EnterFlow> list = enterFlowMapper.findByPage(pageModel);

        result.setTotal(count);
        result.setData(list);
        return result;
    }
}
