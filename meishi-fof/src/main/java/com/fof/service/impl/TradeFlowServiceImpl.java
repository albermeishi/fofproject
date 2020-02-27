package com.fof.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fof.common.dtos.req.tradeflow.ContractBookReq;
import com.fof.common.dtos.req.tradeflow.RiskBookReq;
import com.fof.common.dtos.rsp.ContractBookRsp;
import com.fof.common.dtos.rsp.RiskBookRsp;
import com.fof.dao.FlowOperateLogMapper;
import com.fof.dao.FofMessageMapper;
import com.fof.dao.TradeFlowImpressMapper;
import com.fof.dao.TradeFlowMapper;
import com.fof.dao.TradeFlowRealMapper;
import com.fof.dao.TradeFlowRemitMapper;
import com.fof.dao.TradeFlowTransferMapper;
import com.fof.entity.FlowOperateLog;
import com.fof.entity.FofMessage;
import com.fof.entity.TradeFlow;
import com.fof.entity.TradeFlowImpress;
import com.fof.entity.TradeFlowReal;
import com.fof.entity.TradeFlowRemit;
import com.fof.entity.TradeFlowTransfer;
import com.fof.enums.FOFMessageFromTypeEnum;
import com.fof.enums.FOFMessageModuleTypeEnum;
import com.fof.enums.FOFMessageSendTypeEnum;
import com.fof.enums.FirstBuyFlowEnum;
import com.fof.enums.OperateLogTypeEnum;
import com.fof.service.TradeFlowService;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 00:39
 * @Description:
 */
@Service
public class TradeFlowServiceImpl implements TradeFlowService {
	@Autowired 
	TradeFlowMapper tradeFlowMapper;
	@Autowired
	FlowOperateLogMapper flowOperateLogMapper;
	@Autowired 
    FofMessageMapper fofMessageMapper;
	@Autowired 
	TradeFlowImpressMapper tradeFlowImpressMapper;
	@Autowired 
	TradeFlowRemitMapper tradeFlowRemitMapper;
	@Autowired 
	TradeFlowTransferMapper tradeFlowTransferMapper;
	
	@Autowired 
	TradeFlowRealMapper tradeFlowRealMapper;
	@Override
	public TradeFlowReal queryTradeFlowRealByFlowId(long tradeflowId){
		TradeFlowReal record=new TradeFlowReal();
		record.setTradeflowId(tradeflowId);
	   return tradeFlowRealMapper.selectOneByCondition(record);
	}
	/**  
	 * @Description:通过交易流程Id 查询 运营划款信息
	 * @author alber
	 * @date 2020年2月26日 下午5:31:27  
	 */
	@Override
	public TradeFlowTransfer queryTradeFlowTransferByFlowId(long tradeflowId){
		TradeFlowTransfer recod=new TradeFlowTransfer();
		recod.setTradeflowId(tradeflowId); 
		return  tradeFlowTransferMapper.selectOneByCondition(recod);
	}
	
	/**  
	 * @Description:通过交易流程Id 查询 打款信息
	 * @author alber
	 * @date 2020年2月26日 下午5:31:27  
	 */
	@Override
	public	TradeFlowRemit queryTradeFlowRemitByFlowId(long tradeflowId){
		TradeFlowRemit recod=new TradeFlowRemit();
		recod.setTradeflowId(tradeflowId); 
		return  tradeFlowRemitMapper.selectOneByCondition(recod);
	}
	/**  
	 * @Description:通过交易流程id 查询审核用印信息
	 * @author alber
	 * @date 2020年2月26日 下午5:13:09  
	 */
	@Override
	public List<TradeFlowImpress> queryFlowImpressListByFlowId(long tradeflowId){
		List<TradeFlowImpress> list= new ArrayList<>();
		TradeFlowImpress tfImpress= new TradeFlowImpress();
		tfImpress.setTradeflowId(tradeflowId); 
		tradeFlowImpressMapper.selectListByCondition(tfImpress);
		return list;
	}
	/**  
	 * @Description:通过交易流程id 查询基本信息
	 * @author alber
	 * @date 2020年2月26日 下午4:39:04  
	 */
	@Override
	public TradeFlow queryTradeFlowById (Long flowId){
		return tradeFlowMapper.selectByPrimaryKey(flowId);
	}
	/**  
	 * @Description:查询风险揭示书信息
	 * @author alber
	 * @date 2020年2月26日 下午4:45:46  
	 */
	@Override
	public RiskBookRsp queryRiskBookInfo (RiskBookReq record){
		RiskBookRsp rsp=new RiskBookRsp();
		//TODO 待替换成 从 私募系统读取数据
		rsp.setTradeflowId(record.getTradeflowId());
		rsp.setReadCount(3);
		rsp.setSealCount(5);
		rsp.setFileUrl("https://www.baidu.com/");
		return rsp;
	}
	
	/**  
	 * @Description:查询合同协议书信息
	 * @author alber
	 * @date 2020年2月26日 下午4:52:32  
	 */
	@Override
	public ContractBookRsp queryContractBookInfo (ContractBookReq record){
		ContractBookRsp rsp=new ContractBookRsp();
		//TODO 待替换成 从 私募系统读取数据
		rsp.setTradeflowId(record.getTradeflowId());
		rsp.setReadCount(3);
		rsp.setSealCount(5);
		rsp.setFileUrl("https://www.baidu.com/");
		return rsp;
	}
	
	@Override
	@Transactional
	public TradeFlow saveOfferTrade (TradeFlow record){
		Long flowId=record.getId();
		//当前状态节点
		record.setCurentFlowCodeText(FirstBuyFlowEnum.BUY_INFOS.getCodeText());
		record.setCurrentFlowCode(FirstBuyFlowEnum.BUY_INFOS.getCodeValue());
		if(flowId!=null){
			//更新
			record.setUpdateTime(new Date()); 
			tradeFlowMapper.updateByPrimaryKeySelective(record);
		}
		else{
			//添加
			record.setCreateTime(new Date());
			//TODO 枚举待替换 1 交易中
			record.setTradeStatus(1); 
			tradeFlowMapper.insert(record);
			flowId=record.getId();
		}
		// TODO 待处理  业务判断待添加
		//添加节点变更记录到 flow_operate_log
		FlowOperateLog foLog=new FlowOperateLog();
		foLog.setUserId(1L).setUserName("张三 ").setFlowId(flowId).setCreateTime(new Date())
		.setOperateType(OperateLogTypeEnum.FOF.getTypeCode()).setOperateComment("")
		.setFlowType("firstBuyFlow").setFlowTypeName("认购流程")
		.setAfterCodeValue(FirstBuyFlowEnum.BUY_INFOS.getCodeValue())
		.setAfterCodeText(FirstBuyFlowEnum.BUY_INFOS.getCodeText());
		flowOperateLogMapper.insert(foLog);
		//发送消息
		FofMessage fmsg=new FofMessage();
		fmsg.setFromType(FOFMessageFromTypeEnum.FOF.getTypeCode())
		.setModuleType(FOFMessageModuleTypeEnum.SUBSCRIPTION.getTypeCode())
		.setTargetId(flowId).setSendType(FOFMessageSendTypeEnum.SEND.getTypeCode())
		.setReadStatus(0)
		.setCreateTime(new Date()).setContent(FirstBuyFlowEnum.BUY_INFOS.getCodeText());
		fofMessageMapper.insert(fmsg);
		//记录日志 操作日志
		return tradeFlowMapper.selectByPrimaryKey(flowId); 
	}

	
	
	
	
}
