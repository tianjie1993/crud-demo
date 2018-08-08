package com.example.demo.config.page;

import com.example.demo.config.transfer.TransActions;
import com.sgnbs.crud.modelpagelist.transfer.AbstractDataTransfer;
import org.springframework.stereotype.Component;


@Component
public class TransferBind extends AbstractDataTransfer {

    @Override
    public void bind() {
        configTranAction(TransActions.class);
    }

}
