package com.example.demo.service.impl;

import com.example.demo.model.SysUser;
import com.example.demo.service.intf.SysUserService;
import com.sgnbs.crud.annotation.DelDo;
import com.sgnbs.crud.annotation.ListDo;
import com.sgnbs.crud.annotation.ModelService;
import com.sgnbs.crud.annotation.SaveDo;
import com.sgnbs.crud.util.CrudLocal;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ModelService
public class SysUserServiceImpl implements SysUserService {

    @Override
    @SaveDo(SysUser.class)
    public void saveDo(SysUser user,Map<String,String> map) {
        if (CrudLocal.isNew()){
            //说明是新增的
        }else{
            //编辑
        }
        System.out.println("执行保存方法");

    }

    @Override
    @DelDo(SysUser.class)
    public void delDo(HttpServletRequest request) {
        System.out.println("执行删除方法");

    }

    @Override
    @ListDo(nums={0,1},value=SysUser.class)
    public void listDo(Map<String,String> map) {
        System.out.println("执行查询语句前执行的方法");
    }
}
