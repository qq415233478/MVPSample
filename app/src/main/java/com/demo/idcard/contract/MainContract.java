package com.demo.idcard.contract;

import base.contract.BaseContract;

public interface MainContract {

    interface View extends BaseContract.View {

    }

    interface Presenter extends BaseContract.Presenter<View> {

    }
}
