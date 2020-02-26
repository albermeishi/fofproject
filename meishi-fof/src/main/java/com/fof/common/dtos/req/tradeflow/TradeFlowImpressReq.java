package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:统一审核用印
 * @author alber
 * @date 2020年2月25日 下午10:27:24  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeFlowImpressReq implements Serializable {
	private static final long serialVersionUID = 2702748613369096661L;
	private Long id;
    private Long tradeflowId;
    private String fileName;
    private Integer fileCode;
    private Long attachmentId;
    private Integer cachetStatus;

    private Integer personalSealStatus;

    private Integer opreaterSealStatus;

}
