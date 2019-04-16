package com.demo.idcard.presenter;

import com.demo.idcard.contract.RegisterContract;
import com.demo.idcard.net.NetApi;

import javax.inject.Inject;

public class RegisterPresenter extends IDCardPresenter<RegisterContract.View>
        implements RegisterContract.Presenter {
    @Inject
    protected RegisterPresenter() {

    }

    @Override
    public void onRegister(String username, String startTime, String endTime) {
        if(){

        }

        NetApi.getInstance()
                .register(username);
    }
}
