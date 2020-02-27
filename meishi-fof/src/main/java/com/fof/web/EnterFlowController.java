package com.fof.web;

import com.fof.common.bean.PageModel;
import com.fof.entity.EnterFlow;
import com.fof.response.ResponseData;
import com.fof.service.EnterFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:54
 * @Description:
 */
@RestController
@RequestMapping("/enterFlow")
public class EnterFlowController {
    private static final Logger logger = LoggerFactory.getLogger(EnterFlowController.class);

    @Autowired
    private EnterFlowService enterFlowService;

    /**
     * @Description 被投产品池管理列表查询
     * @Author huxs
     * @Date 2020/2/25
     * @Param [request, response]
     * @return MessageInfo
     **/
    @RequestMapping(value = "/getPage",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData getPage(HttpServletRequest request, HttpServletResponse response, @RequestBody EnterFlow enterFlow) throws Exception {
        PageModel<EnterFlow> searchForm = new PageModel<>();
        searchForm.setPage(1);
        searchForm.setRows(10);
        searchForm.setSearch(enterFlow);
        ResponseData result = enterFlowService.getPage(searchForm);
    	return result;
    }


}
