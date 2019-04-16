package com.demo.idcard.presenter;


import com.demo.idcard.contract.LoginContract;
import com.demo.idcard.net.NetApi;
import com.demo.idcard.net.response.PadLoginResponse;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends IDCardPresenter<LoginContract.View>
        implements LoginContract.Presenter {
    @Inject
    LoginPresenter() {
    }


    @Override
    public void onLogin(String ip, String username, final String password) {
        NetApi.getInstance().setUrl(ip);
        NetApi.getInstance().padLogin(username, password, "123", "2")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PadLoginResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PadLoginResponse padLoginResponse) {
                        if (padLoginResponse.getCode() == 0) {
                            mView.loginSuccess();
                        } else {
                            mView.loginFailed(padLoginResponse.getDesc());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
