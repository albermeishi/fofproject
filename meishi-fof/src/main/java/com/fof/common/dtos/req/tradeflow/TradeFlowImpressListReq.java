package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:统一审核用印list出参
 * @author alber
 * @date 2020年2月25日 下午10:30:34  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeFlowImpressListReq implements Serializable {
	private static final long serialVersionUID = -2424953653196484441L;
	private Long tradeflowId;
	private List<TradeFlowImpressReq> tradeFlowImpressList;
	
}
