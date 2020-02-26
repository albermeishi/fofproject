package com.fof.common.dtos.rsp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fof.common.dtos.req.tradeflow.TradeFlowReq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:用户出参返回实体
 * @author alber
 * @date 2020年2月25日 下午9:12:19  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserRsp  implements Serializable{
	private static final long serialVersionUID = -4098515469938346001L;
	    private Long id;
	    private String userName;
	    private int isCurrentU;

}
