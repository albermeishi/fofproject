package com.fof.service;

import java.util.List;

import com.fof.common.dtos.req.tradeflow.ContractBookReq;
import com.fof.common.dtos.req.tradeflow.RiskBookReq;
import com.fof.common.dtos.rsp.ContractBookRsp;
import com.fof.common.dtos.rsp.RiskBookRsp;
import com.fof.entity.TradeFlow;
import com.fof.entity.TradeFlowImpress;
import com.fof.entity.TradeFlowReal;
import com.fof.entity.TradeFlowRemit;
import com.fof.entity.TradeFlowTransfer;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 00:38
 * @Description:
 */
public interface TradeFlowService {
	public TradeFlow saveOfferTrade (TradeFlow record);
	public TradeFlow queryTradeFlowById (Long flowId);
	public RiskBookRsp queryRiskBookInfo (RiskBookReq record);
	public ContractBookRsp queryContractBookInfo (ContractBookReq  record);
	public List<TradeFlowImpress> queryFlowImpressListByFlowId(long tradeflowId);
	public TradeFlowRemit queryTradeFlowRemitByFlowId(long tradeflowId);
	public TradeFlowTransfer queryTradeFlowTransferByFlowId(long tradeflowId);
	public TradeFlowReal queryTradeFlowRealByFlowId(long tradeflowId);
	
}
