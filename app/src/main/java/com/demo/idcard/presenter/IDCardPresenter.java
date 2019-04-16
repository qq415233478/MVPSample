package com.demo.idcard.presenter;

import base.contract.BaseContract;

public class IDCardPresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {
    protected V mView;

    public void attachView(V baseView) {
        mView = baseView;
    }

    public void detachView() {
        mView = null;
    }
}
