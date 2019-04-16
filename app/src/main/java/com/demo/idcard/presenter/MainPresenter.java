package com.demo.idcard.presenter;

import com.demo.idcard.contract.MainContract;

import javax.inject.Inject;

public class MainPresenter extends IDCardPresenter<MainContract.View>
        implements MainContract.Presenter {

    @Inject
    MainPresenter() {

    }
}
