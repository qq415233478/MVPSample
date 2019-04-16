package com.demo.idcard.contract;

import base.contract.BaseContract;

public interface LoginContract {

    interface View extends BaseContract.View {
        void loginSuccess();

        void loginFailed(String message);
    }

    interface Presenter extends BaseContract.Presenter<View> {
        void onLogin(String ip, String username, final String password);
    }
}
