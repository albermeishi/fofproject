package com.fof.web;

import com.fof.dao.EnterFlowCompanyMapper;
import com.fof.dao.EnterFlowMapper;
import com.fof.dao.FofMessageMapper;
import com.fof.entity.*;
import com.fof.response.ResponseData;
import com.fof.service.EnterFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:54
 * @Description:
 */
@RestController
@RequestMapping("/enterFlow")
public class EnterFlowController {

    @Autowired
    private EnterFlowService enterFlowService;
    @Autowired
    private EnterFlowMapper enterFlowMapper;
    @Autowired
    private EnterFlowCompanyMapper enterFlowCompanyMapper;
    @Autowired
    private FofMessageMapper fofMessageMapper;

    /**
     * 0-首页 条件查询准入单列表
     * @param enterFlow
     * @return
     */
    @PostMapping("/getEnterFlowListByCondition")
    public ResponseData<List<EnterFlow>> selectListByCondition(@RequestBody EnterFlow enterFlow){
        List<EnterFlow> list = enterFlowService.findEnterFlowList(enterFlow);
        return new ResponseData<>(list);
    }

    /**
     * 1.0 根据id查询单条准入申请信息
     * @param id
     * @return
     */
    @GetMapping("checkEnterApplyById/{id}")
    public ResponseData<EnterFlow> checkEnterApplyById(@PathVariable("id") Long id) {
        EnterFlow result = enterFlowMapper.selectByPrimaryKey(id);
        return new ResponseData<>(result);
    }

    /**
     * 条件查询某条准入单信息
     * @param enterFlow
     * @return
     */
    @PostMapping("/selectOneByCondition")
    public ResponseData<EnterFlow> selectOneByCondition(@RequestBody EnterFlow enterFlow) {
        EnterFlow result = enterFlowMapper.selectOneByCondition(enterFlow);
        return new ResponseData<>(result);
    }

    @PostMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody EnterFlow enterFlow){
        return enterFlowMapper.updateByPrimaryKeySelective(enterFlow);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody EnterFlow enterFlow) {
        return enterFlowMapper.insert(enterFlow);
    }

    @PostMapping("/insertSelective")
    public long insertSelective(@RequestBody EnterFlow enterFlow) {
        //return accountMapper.insertSelective(account);
        enterFlowMapper.insertSelective(enterFlow);
        return enterFlow.getId();
    }

    /**
     * 1.1 准入申请审核通过
     * @param enterFlow
     * @return
     */
    @PostMapping("/acceptEnterApply")
    public ResponseData acceptEnterApply(@RequestBody EnterFlow enterFlow){
        int result = enterFlowService.acceptEnterApply(enterFlow);
        return new ResponseData<>(result);
    }

    /**
     * 1.2 准入申请审核拒绝
     * @param enterFlowDto
     * @return
     */
    @PostMapping("/refuseEnterApply")
    public ResponseData refuseEnterApply(@RequestBody EnterFlowDto enterFlowDto){
        int result = enterFlowService.refuseEnterApply(enterFlowDto);
        return new ResponseData<>(result);
    }

    /**
     * 查询某条公司资料准入信息
     * @param id
     * @return
     */
    @GetMapping("checkEnterFlowCompanyById/{id}")
    public ResponseData<EnterFlowCompany> checkEnterFlowCompanyById(@PathVariable("id") Long id) {
        EnterFlowCompany result = enterFlowCompanyMapper.selectByPrimaryKey(id);
        return new ResponseData<>(result);
    }

    /**
     * 2.1 存储公司基础准入资料授权
     * @param enterFlowCompany
     * @return
     */
    @PostMapping("/saveEnterFlowCompany")
    public ResponseData saveEnterFlowCompany(@RequestBody EnterFlowCompany enterFlowCompany){
        int result = enterFlowService.saveEnterFlowCompany(enterFlowCompany);
        return new ResponseData<>(result);
    }

    /**
     * 2.2 查询某条准入信息的所有消息记录
     * @param id
     * @return
     */
    @GetMapping("checkEnterFlowMessage/{id}")
    public ResponseData<List<FofMessage>> checkEnterFlowMessage(@PathVariable("id") Long id) {
        FofMessage fofMessage = new FofMessage();
        fofMessage.setTargetId(id);
        List<FofMessage> result = fofMessageMapper.selectListByCondition(fofMessage);
        return new ResponseData<>(result);
    }

    /**
     * 条件查询公司准入资料列表
     * @param enterFlowCompany
     * @return
     */
    @PostMapping("/getEnterFlowCompanyListByCondition")
    public ResponseData<List<EnterFlowCompany>> getEnterFlowCompanyListByCondition(@RequestBody EnterFlowCompany enterFlowCompany){
        List<EnterFlowCompany> list = enterFlowCompanyMapper.selectListByCondition(enterFlowCompany);
        return new ResponseData<>(list);
    }

    /**
     * 3.1 存储产品基础准入资料授权
     * @param enterFlowProduct
     * @return
     */
    @PostMapping("/saveEnterFlowProduct")
    public ResponseData saveEnterFlowProduct(@RequestBody EnterFlowProduct enterFlowProduct){
        int result = enterFlowService.saveEnterFlowProduct(enterFlowProduct);
        return new ResponseData<>(result);
    }
}
