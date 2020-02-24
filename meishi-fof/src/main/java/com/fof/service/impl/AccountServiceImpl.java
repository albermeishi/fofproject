/**  
 * @Description:
 * @author author
 * @date 2020年2月23日 下午10:10:21  
 */
package com.fof.service.impl;
import java.util.List;
import com.fof.entity.Account;
public interface AccountServiceImpl {
	   int add(String name, double money); 
	   int update(String name, double money, int id); 
	   int delete(int id); 
	   Account findAccount(int id);
	   List<Account> findAccountList();
}
