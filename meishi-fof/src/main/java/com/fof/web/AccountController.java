
package com.fof.web;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fof.common.dtos.req.tradeflow.TradeFlowReq;
import com.fof.dao.AccountMapper;
import com.fof.entity.Account;
import com.fof.response.ResponseData;
import com.fof.service.AccountService;
@RestController
@RequestMapping("/account")
@SuppressWarnings(value={"unchecked", "deprecation"})
public class AccountController {

	private  Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AccountService accountService;
    @Autowired
    AccountMapper accountMapper;
    @PostMapping("/selectListByCondition")
    public   List<Account>  selectListByCondition(@RequestBody Account account) {
    	List<Account> list= new ArrayList<>(); 
    	Account account2=new Account();
    	account2.setMoney(18.4); 
    	account2.setName("122");
    	account2.setId(1);
    	log.info("查询指定角色的权限参数："+account);
    	list.add(account2);
    	return list;
    	//accountService.findAccountList();
//    	if(list.size()>0){
//    		throw new ServiceException(1003,"操作异常");
//    	}
    	//return new ResponseData<List<TradeFlowReq>>(list);
    	
        //return accountMapper.selectListByCondition(account);
    }
    @PostMapping("/selectOneByCondition")
    public Account selectOneByCondition(@RequestBody Account account) {
        return accountMapper.selectOneByCondition(account);
    }
    
    @PostMapping("/insert")
    public int insert(@RequestBody Account account) {
    	return accountMapper.insert(account);
    }
    
    @PostMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody Account account) {
    	return accountMapper.updateByPrimaryKeySelective(account);
    }
    @PostMapping("/insertSelective")
    public int insertSelective(@RequestBody Account account) {
    	//return accountMapper.insertSelective(account);
    	accountMapper.insertSelective(account);
    	return account.getId();
    }
    
    @GetMapping("selectByPrimaryKey/{id}")
    public Account selectByPrimaryKey(@PathVariable("id") int id) {
        return accountMapper.selectByPrimaryKey(id);
    }
    
    
    
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        int t= accountService.update(name,money,id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id")int id) {
        int t= accountService.delete(id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

    @PostMapping
    public String postAccount(@RequestBody Account account) {
       int t= accountService.add(account.getName(),account.getMoney());
       if(t>1) {
           return "success";
       }else {
           return "fail";
       }
       
    }
    
}


