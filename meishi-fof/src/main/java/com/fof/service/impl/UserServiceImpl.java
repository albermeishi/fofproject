/**  
 * @Description:
 * @author author
 * @date 2020年2月23日 下午10:24:09  
 */
package com.fof.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fof.common.dtos.rsp.UserRsp;
import com.fof.dao.UserMapper;
import com.fof.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<UserRsp> queryUserList() {
		return userMapper.queryUserList();
	}

}
