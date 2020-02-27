package com.fof.service.impl;

import com.fof.dao.*;
import com.fof.entity.*;
import com.fof.enums.*;
import com.fof.service.EnterFlowService;
import com.sun.tools.javac.comp.Enter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.EndpointReference;
import java.util.Date;
import java.util.List;

/**
 * 上海美市科技有限公司开发部
 * @author   :zhaohy
 * @date    : 2020/02/24 16:58
 * @Description:
 */
@Service
public class EnterFlowServiceImpl implements EnterFlowService {

    @Autowired
    private EnterFlowMapper enterFlowMapper;
    @Autowired
    private FlowOperateLogMapper flowOperateLogMapper;
    @Autowired
    private FofMessageMapper fofMessageMapper;
    @Autowired
    private FlowBackMapper flowBackMapper;
    @Autowired
    private EnterFlowCompanyMapper enterFlowCompanyMapper;
    @Autowired
    private EnterFlowProductMapper enterFlowProductMapper;

    @Override
    public List<EnterFlow> findEnterFlowList(EnterFlow enterFlow) {
        return enterFlowMapper.selectListByCondition(enterFlow);
    }

    @Override
    public int acceptEnterApply(EnterFlow enterFlow) {
        //更新节点、操作人、操作时间
        enterFlow.setCurrentFlowCode(EnterFlowEnum.ENTER_CHECK.getCodeValue());
        enterFlow.setCurentFlowCodeText(EnterFlowEnum.ENTER_CHECK.getCodeText());
        enterFlow.setSimuOperatorTime(new Date());
        enterFlow.setUpdateTime(new Date());
        enterFlowMapper.updateByPrimaryKeySelective(enterFlow);

        //更新操作记录
        FlowOperateLog flowOperateLog = new FlowOperateLog();
        flowOperateLog.setUserId(enterFlow.getSimuOperatorId());
        flowOperateLog.setUserName(enterFlow.getSimuOperatorName());
        flowOperateLog.setOperateType(OperateLogTypeEnum.MANAGER.getTypeCode());
        flowOperateLog.setFlowType("enterFlow");
        flowOperateLog.setFlowTypeName("准入流程");
        flowOperateLog.setBeforeCodeValue(EnterFlowEnum.BASE_INFO_COMPLETE.getCodeValue());
        flowOperateLog.setBeforeCodeText(EnterFlowEnum.BASE_INFO_COMPLETE.getCodeText());
        flowOperateLog.setAfterCodeValue(EnterFlowEnum.ENTER_CHECK.getCodeValue());
        flowOperateLog.setAfterCodeText(EnterFlowEnum.ENTER_CHECK.getCodeText());
        flowOperateLog.setCreateTime(new Date());
//        从"基本信息填写完成"到"准入申请审核通过"
        flowOperateLog.setOperateComment("从" + EnterFlowEnum.BASE_INFO_COMPLETE.getCodeText() + "到" + EnterFlowEnum.ENTER_CHECK.getCodeText());
        flowOperateLog.setCreateTime(new Date());
        flowOperateLog.setFlowId(enterFlow.getId());
        flowOperateLogMapper.insert(flowOperateLog);

        //更新消息提醒
        FofMessage fofMessage = new FofMessage();
        fofMessage.setFromType(FOFMessageFromTypeEnum.MANAGER.getTypeCode());
        fofMessage.setModuleType(FOFMessageModuleTypeEnum.ENTER.getTypeCode());
        fofMessage.setTargetId(enterFlow.getId());
        fofMessage.setSendType(FOFMessageSendTypeEnum.SEND.getTypeCode());
        fofMessage.setContent(EnterFlowEnum.ENTER_CHECK.getCodeText());
        fofMessage.setReadStatus(FOFMessageReadStatusEnum.UNREAD.getTypeCode());
        fofMessage.setCreateTime(new Date());
        return fofMessageMapper.insert(fofMessage);
    }

    /**
     * 准入申请审核拒绝
     * @param enterFlowDto
     * @return
     */
    @Override
    public int refuseEnterApply(EnterFlowDto enterFlowDto) {

        EnterFlow enterFlow = new EnterFlow();
        BeanUtils.copyProperties(enterFlowDto, enterFlow);

        //更新节点、操作人、操作时间
        enterFlow.setCurrentFlowCode(EnterFlowEnum.ENTER_NO_CHECK.getCodeValue());
        enterFlow.setCurentFlowCodeText(EnterFlowEnum.ENTER_NO_CHECK.getCodeText());
        enterFlow.setSimuOperatorTime(new Date());
        enterFlowMapper.updateByPrimaryKeySelective(enterFlow);

        //更新操作记录
        FlowOperateLog flowOperateLog = new FlowOperateLog();
        flowOperateLog.setUserId(enterFlow.getSimuOperatorId());
        flowOperateLog.setUserName(enterFlow.getSimuOperatorName());
        flowOperateLog.setOperateType(OperateLogTypeEnum.MANAGER.getTypeCode());
        flowOperateLog.setFlowType("enterFlow");
        flowOperateLog.setFlowTypeName("准入流程");
        flowOperateLog.setBeforeCodeValue(EnterFlowEnum.BASE_INFO_COMPLETE.getCodeValue());
        flowOperateLog.setBeforeCodeText(EnterFlowEnum.BASE_INFO_COMPLETE.getCodeText());
        flowOperateLog.setAfterCodeValue(EnterFlowEnum.ENTER_NO_CHECK.getCodeValue());
        flowOperateLog.setAfterCodeText(EnterFlowEnum.ENTER_NO_CHECK.getCodeText());
        flowOperateLog.setCreateTime(new Date());
        flowOperateLog.setOperateComment("从" + EnterFlowEnum.BASE_INFO_COMPLETE.getCodeText() + "到" + EnterFlowEnum.ENTER_NO_CHECK.getCodeText());
        flowOperateLog.setCreateTime(new Date());
        flowOperateLog.setFlowId(enterFlow.getId());
        flowOperateLogMapper.insert(flowOperateLog);

        //更新拒绝内容
        FlowBack flowBack = new FlowBack();
        flowBack.setUserId(enterFlow.getSimuOperatorId());
        flowBack.setUserName(enterFlow.getSimuOperatorName());
        flowBack.setContent(enterFlowDto.getContent());
        flowBack.setFlowId(enterFlow.getId());
        flowBack.setFlowType(1);
        flowBack.setCreateTime(new Date());
        flowBackMapper.insert(flowBack);

        //更新消息提醒
        FofMessage fofMessage = new FofMessage();
        fofMessage.setFromType(FOFMessageFromTypeEnum.MANAGER.getTypeCode());
        fofMessage.setModuleType(FOFMessageModuleTypeEnum.ENTER.getTypeCode());
        fofMessage.setTargetId(enterFlow.getId());
        fofMessage.setSendType(FOFMessageSendTypeEnum.SEND.getTypeCode());
        fofMessage.setContent(EnterFlowEnum.ENTER_NO_CHECK.getCodeText() +",不通过理由：" + enterFlowDto.getContent());
        fofMessage.setReadStatus(FOFMessageReadStatusEnum.UNREAD.getTypeCode());
        fofMessage.setCreateTime(new Date());
        return fofMessageMapper.insert(fofMessage);
    }

    /**
     * 存储公司基础准入资料授权
     * @param enterFlowCompany
     * @return
     */
    @Override
    public int saveEnterFlowCompany(EnterFlowCompany enterFlowCompany) {

        //更新准入资料授权数据
        //TODO 自动生成tagId
        Long tagId = 1L;
        enterFlowCompany.setTagId(tagId);
        enterFlowCompanyMapper.insert(enterFlowCompany);

        //更新准入流程节点
        EnterFlow enterFlow = new EnterFlow();
        enterFlow.setId(enterFlowCompany.getEnterFlowId());
        enterFlow.setCurrentFlowCode(EnterFlowEnum.COMPANY_IMPOWER.getCodeValue());
        enterFlow.setCurentFlowCodeText(EnterFlowEnum.COMPANY_IMPOWER.getCodeText());
        enterFlowMapper.updateByPrimaryKeySelective(enterFlow);

        //更新消息提醒
        FofMessage fofMessage = new FofMessage();
        fofMessage.setFromType(FOFMessageFromTypeEnum.MANAGER.getTypeCode());
        fofMessage.setModuleType(FOFMessageModuleTypeEnum.ENTER.getTypeCode());
        fofMessage.setTargetId(enterFlowCompany.getId());
        fofMessage.setSendType(FOFMessageSendTypeEnum.SEND.getTypeCode());
        fofMessage.setContent("");//消息内容???
        fofMessage.setReadStatus(FOFMessageReadStatusEnum.UNREAD.getTypeCode());
        fofMessage.setCreateTime(new Date());
        return fofMessageMapper.insert(fofMessage);
    }

    /**
     * 存储公司基础准入资料授权
     *
     * @param enterFlowProduct
     * @return
     */
    @Override
    public int saveEnterFlowProduct(EnterFlowProduct enterFlowProduct) {
        //更新准入资料授权数据
        //TODO 自动生成tagId
        Long tagId = 1L;
        enterFlowProduct.setTagId(tagId);
        enterFlowProductMapper.insert(enterFlowProduct);

        //更新准入流程节点
        EnterFlow enterFlow = new EnterFlow();
        enterFlow.setId(enterFlowProduct.getEnterFlowId());
        enterFlow.setCurrentFlowCode(EnterFlowEnum.PRODUCT_IMPOWER.getCodeValue());
        enterFlow.setCurentFlowCodeText(EnterFlowEnum.PRODUCT_IMPOWER.getCodeText());
        enterFlowMapper.updateByPrimaryKeySelective(enterFlow);

        //更新消息提醒
        FofMessage fofMessage = new FofMessage();
        fofMessage.setFromType(FOFMessageFromTypeEnum.MANAGER.getTypeCode());
        fofMessage.setModuleType(FOFMessageModuleTypeEnum.ENTER.getTypeCode());
        fofMessage.setTargetId(enterFlowProduct.getId());
        fofMessage.setSendType(FOFMessageSendTypeEnum.SEND.getTypeCode());
        fofMessage.setContent(EnterFlowEnum.PRODUCT_IMPOWER.getCodeText());
        fofMessage.setReadStatus(FOFMessageReadStatusEnum.UNREAD.getTypeCode());
        fofMessage.setCreateTime(new Date());
        return fofMessageMapper.insert(fofMessage);
    }
}
