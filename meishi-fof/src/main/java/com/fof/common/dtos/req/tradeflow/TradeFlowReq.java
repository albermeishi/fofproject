package com.fof.common.dtos.req.tradeflow;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/**  
 * @Description:认购基本信息Form
 * @author alber
 * @date 2020年2月24日 下午11:35:25  
 */
public class TradeFlowReq implements Serializable{
	private static final long serialVersionUID = -2903775857476747169L;
	    private Long id;
	    private Long simuCompanyId;
	    private String simuCompanyName;

	    private Long simuProductId;

	    private String simuProductName;

	    private Long fofCompanyId;

	    private String fofCompanyName;

	    private Long fofProductId;

	    private String fofProductName;

	    private Long fofOperatorId;

	    private String fofOperatorName;

	    private Long boffinId;

	    private String boffinIdName;

	    private Long tradeUserId;

	    private String tradeUserName;

	    private BigDecimal tradeMoney;

	    private String tradeMoneyUpper;
	    private Integer tradeOnine;
	    private Integer tradeType;
	    private String accountName;
	    private String accountNumber;
	    private String bankName;
	
	
}
