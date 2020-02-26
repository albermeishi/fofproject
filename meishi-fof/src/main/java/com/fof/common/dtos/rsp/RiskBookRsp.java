package com.fof.common.dtos.rsp;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**  
 * @Description:风险揭示书签署
 * @author alber
 * @date 2020年2月25日 下午9:47:15  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RiskBookRsp implements Serializable {
	private static final long serialVersionUID = 1736441351534577949L;
	private Long id;
	private Long tradeflowId;
	private Integer readCount;
	private Integer sealCount;
	private String fileUrl;
	
}
