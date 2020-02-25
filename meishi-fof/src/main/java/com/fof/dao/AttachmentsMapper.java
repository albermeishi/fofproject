package com.fof.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fof.entity.Attachments;
@Mapper
public interface AttachmentsMapper {

    int insert(Attachments record);

    int insertSelective(Attachments record);

    Attachments selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Attachments record);

    Attachments selectOneByCondition(Attachments record);
    List<Attachments> selectListByCondition(Attachments record);
    
    
    
}