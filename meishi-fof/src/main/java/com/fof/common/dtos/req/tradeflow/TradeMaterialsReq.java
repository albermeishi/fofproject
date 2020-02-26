package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:认购材料信息保存
 * @author alber
 * @date 2020年2月26日 上午9:55:56  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeMaterialsReq implements Serializable{
	private static final long serialVersionUID = -9029397015678222824L;
	private Integer riskType;
    private Long tradeflowId;
	
}
