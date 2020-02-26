package com.fof.common.dtos.rsp;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  
 * @Description:操作返回标识
 * @author alber
 * @date 2020年2月26日 上午9:28:11  
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class FlagInfoRsp implements Serializable{
	private static final long serialVersionUID = 8756363590950074214L;
	private boolean flagId;
    private String flagMessage;
    
}
