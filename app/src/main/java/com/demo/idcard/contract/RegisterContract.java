package com.demo.idcard.contract;

import base.contract.BaseContract;

public interface RegisterContract {

    interface View extends BaseContract.View {
        void onRegisterSuccess();

        void onRegisterFailed(String errorMessage);
    }

    interface Presenter extends BaseContract.Presenter<View> {
        void onRegister(String username, String startTime, String endTime);
    }
}
