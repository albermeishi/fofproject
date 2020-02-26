package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:交易打款信息记录(认购,申购)
 * @author alber
 * @date 2020年2月25日 下午9:31:43  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeFlowRemitReq implements Serializable{
	private static final long serialVersionUID = 1898253377856101687L;
	private Long id;
    private Long tradeflowId;
    private BigDecimal remitTradeMoney;
    private String remitTradeMoneyUpper;
    private String accountName;
    private String accountNumber;
    private String bankName;
}
