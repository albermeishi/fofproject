package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:认购  风险揭示书   合同协议 入参
 * @author alber
 * @date 2020年2月26日 上午10:44:52  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TradeBookReq  implements Serializable{
	private static final long serialVersionUID = -8312533408993415581L;
	private Long tradeflowId;
	/** 1：风险揭示书,2:合同协议签署 */
	private Integer bookType;
	private String fileUrl;
	
}
