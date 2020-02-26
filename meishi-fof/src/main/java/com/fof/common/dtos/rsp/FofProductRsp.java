package com.fof.common.dtos.rsp;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:fof 母基金实体返回
 * @author author
 * @date 2020年2月25日 下午9:17:21  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class FofProductRsp  implements Serializable{
	private static final long serialVersionUID = -891748401818748593L;
	private Long id;
    private Long fofCompanyId;
    private String fofCompanyName;
    private String productName;
    private String accountName;
    private String accountNumber;
    private String bankName;

	
}
