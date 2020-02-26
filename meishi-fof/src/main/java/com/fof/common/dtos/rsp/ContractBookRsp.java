package com.fof.common.dtos.rsp;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:合同协议签署返回
 * @author alber
 * @date 2020年2月25日 下午9:51:13  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ContractBookRsp implements Serializable {
	private static final long serialVersionUID = 2596441314063541532L;
	private Long id;
	private Long tradeflowId;
	private Integer readCount;
	private Integer sealCount;
	private String fileUrl;
}
