package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fof.entity.Account;
import com.fof.entity.Attachments;
@Mapper
public interface AccountMapper {
	
    int insert(Account record);
    int insertSelective(Account record);
    Account selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Account record);
  
    Account selectOneByCondition(Account record);
    List<Account> selectListByCondition(Account record);
    
    
//	@Insert("insert into account(name, money) values(#{name}, #{money})")
//    @Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")
//	int insert(Account account);
    
//    @Select("select id, name as name, money as money from account where id = #{id}")
//	Account selectByPrimaryKey(@Param("id") int id);
//    
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from account where id = #{id}")
    Account findAccount(@Param("id") int id);


//    @Select("select id, name as name, money as money from account")
//    List<Account> findAccountList();
      List<Account> findAccountList();
    
    
    
}