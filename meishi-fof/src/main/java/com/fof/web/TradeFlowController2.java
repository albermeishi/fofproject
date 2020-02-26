package com.fof.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fof.common.dtos.req.tradeflow.ContractBookReq;
import com.fof.common.dtos.req.tradeflow.RiskBookReq;
import com.fof.common.dtos.req.tradeflow.TradeBookReq;
import com.fof.common.dtos.req.tradeflow.TradeFlowImpressListReq;
import com.fof.common.dtos.req.tradeflow.TradeFlowRemitReq;
import com.fof.common.dtos.req.tradeflow.TradeFlowReq;
import com.fof.common.dtos.req.tradeflow.TradeFlowTransferReq;
import com.fof.common.dtos.req.tradeflow.TradeMaterialsReq;
import com.fof.common.dtos.rsp.ContractBookRsp;
import com.fof.common.dtos.rsp.FlagInfoRsp;
import com.fof.common.dtos.rsp.FofProductRsp;
import com.fof.common.dtos.rsp.RiskBookRsp;
import com.fof.common.dtos.rsp.SimuProductRsp;
import com.fof.common.dtos.rsp.UserRsp;
import com.fof.entity.TradeFlow;
import com.fof.entity.TradeFlowImpress;
import com.fof.entity.TradeFlowReal;
import com.fof.entity.TradeFlowRemit;
import com.fof.entity.TradeFlowTransfer;
import com.fof.response.ResponseData;

/**
 * 上海美市科技有限公司开发部
 *
 * @author :zhaohy
 * @date    : 2020/02/25 00:37
 * @Description:
 */
@RestController
@RequestMapping("/trade")
public class TradeFlowController2 {
	
	/**  
	 * @Description:通过FOF母基金名称模糊查询母基金数据
	 * @author alber
	 * @date 2020年2月25日 下午10:59:02  
	 */
	@PostMapping("/queryfofProductsByName")
	public ResponseData<List<FofProductRsp>> queryfofProductsByName(@RequestParam(value = "searchName") String searchName){ 
    	List<FofProductRsp> list= new ArrayList<>();
    	return new ResponseData<List<FofProductRsp>>(list);
	}
	/**  
	 * @Description:通过被投基金名称 模糊查询基金数据
	 * @author author
	 * @date 2020年2月25日 下午11:00:12  
	 */
	@PostMapping("/querySimuProductsByName")
	public ResponseData<List<SimuProductRsp>> querySimuProductsByName(@RequestParam(value = "searchName") String searchName){ 
    	List<SimuProductRsp> list= new ArrayList<>();
    	return new ResponseData<List<SimuProductRsp>>(list);
	} 
	/**  
	 * @Description:查询有效用户列表数据
	 * @author alber
	 * @date 2020年2月25日 下午11:04:14  
	 */
	@GetMapping("/queryUserList")
	public ResponseData<List<UserRsp>> queryUserList(){ 
    	List<UserRsp> list= new ArrayList<>();
    	return new ResponseData<List<UserRsp>>(list);
	}
	
	/**  
	 * @Description:认购基本信息保存
	 * @author alber
	 * @date 2020年2月25日 下午11:12:20  
	 */
	@PostMapping("/saveOfferTrade")
	public ResponseData<TradeFlow> saveOfferTrade(@RequestBody TradeFlowReq form){ 
		TradeFlow tradeFlow=new TradeFlow();
    	return new ResponseData<TradeFlow>(tradeFlow);
	}
	/**  
	 * @Description:通过交易流程id 查询基本信息
	 * @author alber
	 * @date 2020年2月26日 上午8:35:32  
	 */
	@PostMapping("/queryTradeFlowById")
	public ResponseData<TradeFlow> queryTradeFlowById(@RequestParam(value = "tradeflowId") long tradeflowId){
		TradeFlow tradeFlow=new TradeFlow();
    	return new ResponseData<TradeFlow>(tradeFlow);
	}
	
	
	
	/**  
	 * @Description:认购材料信息保存
	 * @author alber
	 * @date 2020年2月26日 上午10:37:38  
	 */
	@PostMapping("/saveTradeMaterials")
	public ResponseData<FlagInfoRsp> saveTradeMaterials(@RequestBody TradeMaterialsReq form){ 
		FlagInfoRsp flagInfoRsp=new FlagInfoRsp();
    	return new ResponseData<FlagInfoRsp>(flagInfoRsp);
	}
	/**  
	 * @Description:风险揭示书查询
	 * @author alber
	 * @date 2020年2月26日 上午8:42:37  
	 */
	@PostMapping("/queryRiskBookInfo")
	public ResponseData<RiskBookRsp> queryRiskBookInfo(@RequestBody RiskBookReq form){ 
		RiskBookRsp riskBookRsp=new RiskBookRsp();
    	return new ResponseData<RiskBookRsp>(riskBookRsp);
	}
	/**  
	 * @Description:合同协议签署查询
	 * @author alber
	 * @date 2020年2月26日 上午8:42:37  
	 */
	@PostMapping("/queryContractBookInfo")
	public ResponseData<ContractBookRsp> queryContractBookInfo(@RequestBody ContractBookReq form){ 
		ContractBookRsp contractBookRsp=new ContractBookRsp();
    	return new ResponseData<ContractBookRsp>(contractBookRsp);
	}
	
	/**  
	 * @Description:认购流程风险揭示书 合同协议书保存
	 * @author alber
	 * @date 2020年2月26日 上午10:55:57  
	 */
	@PostMapping("/saveTradeBook")
	public ResponseData<FlagInfoRsp> saveTradeBook(@RequestBody TradeBookReq form){ 
		FlagInfoRsp flagInfoRsp=new FlagInfoRsp();
    	return new ResponseData<FlagInfoRsp>(flagInfoRsp);
	}
	/**  
	 * @Description:统一审核用印保存
	 * @author alber
	 * @date 2020年2月26日 上午9:33:58  
	 */
	@PostMapping("/saveOfferImpress")
	public ResponseData<FlagInfoRsp> saveOfferImpress(@RequestBody TradeFlowImpressListReq form){ 
		FlagInfoRsp flagInfoRsp=new FlagInfoRsp();
    	return new ResponseData<FlagInfoRsp>(flagInfoRsp);
	}
	/**  
	 * @Description:通过交易流程id 查询审核用印信息
	 * @author alber
	 * @date 2020年2月26日 上午8:52:54  
	 */
	@PostMapping("/queryFlowImpressListByFlowId")
	public ResponseData<List<TradeFlowImpress>> queryFlowImpressListByFlowId(@RequestParam(value = "tradeflowId") long tradeflowId){ 
    	List<TradeFlowImpress> list= new ArrayList<>();
    	return new ResponseData<List<TradeFlowImpress>>(list);
	}
	
	/**  
	 * @Description:通过交易流程Id 查询 打款信息
	 * @author alber
	 * @date 2020年2月25日 下午11:27:03  
	 */
	@PostMapping("/queryTradeFlowRemitByFlowId")
	public ResponseData<TradeFlowRemit> queryTradeFlowRemitByFlowId(@RequestParam(value = "tradeflowId") long tradeflowId){
		TradeFlowRemit tradeFlowRemit=new TradeFlowRemit();
    	return new ResponseData<TradeFlowRemit>(tradeFlowRemit);
	}
	/**  
	 * @Description:认购 打款信息保存
	 * @author alber
	 * @date 2020年2月25日 下午11:20:02  
	 */
	@PostMapping("/saveOfferRemit")
	public ResponseData<TradeFlowRemit> saveOfferRemit(@RequestBody TradeFlowRemitReq form){ 
		TradeFlowRemit tradeFlowRemit=new TradeFlowRemit();
    	return new ResponseData<TradeFlowRemit>(tradeFlowRemit);
	}
	/**  
	 * @Description:通过交易流程Id 查询 运营划款信息
	 * @author alber
	 * @date 2020年2月25日 下午11:30:07  
	 */
	@PostMapping("/queryTradeFlowTransferByFlowId")
	public ResponseData<TradeFlowTransfer> queryTradeFlowTransferByFlowId(@RequestParam(value = "tradeflowId") long tradeflowId){
		TradeFlowTransfer tradeFlowTransfer=new TradeFlowTransfer();
    	return new ResponseData<TradeFlowTransfer>(tradeFlowTransfer);
	}
	/**  
	 * @Description:认购运营划款确认保存
	 * @author alber
	 * @date 2020年2月25日 下午11:23:07  
	 */
	@PostMapping("/saveOfferTransfer")
	public ResponseData<TradeFlowTransfer> saveOfferTransfer(@RequestBody TradeFlowTransferReq form){ 
		TradeFlowTransfer tradeFlowTransfer=new TradeFlowTransfer();
    	return new ResponseData<TradeFlowTransfer>(tradeFlowTransfer);
	}
	
	/**  
	 * @Description:通过流程Id 查询 交易确权完成信息
	 * @author alber
	 * @date 2020年2月25日 下午11:43:45  
	 */
	@PostMapping("/queryTradeFlowRealByFlowId")
	public ResponseData<TradeFlowReal> queryTradeFlowRealByFlowId(@RequestParam(value = "tradeflowId",required = true) long tradeflowId){
		TradeFlowReal tradeFlowReal=new TradeFlowReal();
    	return new ResponseData<TradeFlowReal>(tradeFlowReal);
	}
	
	
	

	
	

	
}
