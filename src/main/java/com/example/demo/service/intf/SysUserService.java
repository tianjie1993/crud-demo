package com.example.demo.service.intf;

import com.example.demo.model.SysUser;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface SysUserService {

    void saveDo(SysUser user,Map<String,String> map);
    void delDo(HttpServletRequest request);

    void listDo(Map<String,String> map);

}
