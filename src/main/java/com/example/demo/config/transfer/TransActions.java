package com.example.demo.config.transfer;

import com.sgnbs.crud.annotation.ListTransf;

public class TransActions {

    @ListTransf("action1")
    public String action1(Object o){
        return "1";
    }
}
