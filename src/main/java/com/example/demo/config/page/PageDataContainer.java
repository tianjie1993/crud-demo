package com.example.demo.config.page;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sgnbs.crud.modelpagelist.container.PageDataContainerintf;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PageDataContainer implements PageDataContainerintf {

    @Override
    public Object pack(Page page) {
        return new PageInfo<>(page.getResult(),page.getPageNum());
    }

    @Override
    public Object pack(List list) {
        return list;
    }
}
