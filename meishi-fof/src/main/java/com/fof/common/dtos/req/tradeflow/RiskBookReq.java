package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:风险揭示书签署 入参
 * @author alber
 * @date 2020年2月25日 下午10:00:58  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RiskBookReq implements Serializable {
	private static final long serialVersionUID = 6477828128084821511L;
	private Long tradeflowId;
	private String fileUrl;

}
