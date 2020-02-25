package com.fof.web;

import com.fof.dao.AccountMapper;
import com.fof.entity.Account;
import com.fof.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@RestController
@RequestMapping("/account")
public class AccountController {

	
    @Autowired
    AccountService accountService;
    @Autowired
    AccountMapper accountMapper;
    @PostMapping("/selectListByCondition")
    public List<Account> selectListByCondition(@RequestBody Account account) {
        //return accountService.findAccountList();
        return accountMapper.selectListByCondition(account);
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