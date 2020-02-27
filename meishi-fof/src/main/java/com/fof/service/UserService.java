/**  
 * @Description:
 * @author author
 * @date 2020年2月23日 下午10:22:03  
 */
package com.fof.service;

import java.util.List;

import com.fof.common.dtos.rsp.UserRsp;

public interface UserService {
	public List<UserRsp> queryUserList();
}
