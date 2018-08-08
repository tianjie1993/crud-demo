package com.example.demo.config.page;


import com.sgnbs.crud.modelpagelist.PageDataManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageListDataConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public PageDataManagement getPageMa(){
        PageDataManagement pageDataManagement = new PageDataManagement(applicationContext);
        pageDataManagement.setPageDataContainer(PageDataContainer.class);
        pageDataManagement.setAbstractDataTransfer(TransferBind.class);
        return pageDataManagement;
    }
}
