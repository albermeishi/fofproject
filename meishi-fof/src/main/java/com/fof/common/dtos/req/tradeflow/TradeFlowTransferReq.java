package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:交易运营划款确认(认购,申购,赎回)
 * @author alber
 * @date 2020年2月25日 下午9:35:20  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeFlowTransferReq implements Serializable {
	private static final long serialVersionUID = -4297854177904778839L;
	private Long id;
    private Long tradeflowId;
    private BigDecimal transferTradeMoney;
    private String transferTradeMoneyUpper;
    private Integer noticeType;
    private Date transferTime;
	
}
