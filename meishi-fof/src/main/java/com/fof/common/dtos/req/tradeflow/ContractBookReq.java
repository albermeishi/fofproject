package com.fof.common.dtos.req.tradeflow;

import java.io.Serializable;

import com.fof.common.dtos.rsp.ContractBookRsp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**  
 * @Description:合同协议签署
 * @author alber
 * @date 2020年2月25日 下午9:57:57  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ContractBookReq  implements Serializable{
	private static final long serialVersionUID = 6477828128084821511L;
	private Long tradeflowId;
	private String fileUrl;
	
	
}
