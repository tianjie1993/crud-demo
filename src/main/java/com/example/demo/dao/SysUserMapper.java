package com.example.demo.dao;

import com.example.demo.model.SysUser;
import com.sgnbs.crud.annotation.Islist;
import com.sgnbs.crud.annotation.ModelDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
@ModelDAO(SysUser.class)
public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    @Islist
    List<Map<String,String>> findSysUserList(Map<String,String> map);



}