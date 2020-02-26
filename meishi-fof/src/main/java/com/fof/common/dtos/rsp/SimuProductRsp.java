package com.fof.common.dtos.rsp;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:被投基金实体返回
 * @author alber
 * @date 2020年2月25日 下午9:23:42  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SimuProductRsp implements Serializable {
	private static final long serialVersionUID = 818381281855377983L;
	private Long id;
    private String simuCompanyName;
    private Long simuCompanyId;
    private String productName;



    

}
