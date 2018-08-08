package com.example.demo.config.eum;

import com.sgnbs.crud.annotation.EumConfig;
import com.sgnbs.crud.eum.AbstractAutoConfigEums;

import java.util.HashMap;
import java.util.Map;

/**
 * key sys_user-status
 * value 1=正常,2=删除
 */
@EumConfig
public class EumConfiguration  extends AbstractAutoConfigEums {
    @Override
    public void bindEums() {
        Map<String,String> temp = new HashMap<>();
        temp.put("sys_user-status","1=正常,2=删除");
        configEums(temp);
    }
}
