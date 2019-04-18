package com.demo.idcard.presenter;

import android.os.SystemClock;
import android.util.Log;

import com.demo.idcard.contract.RegisterContract;
import com.demo.idcard.net.NetApi;
import com.demo.idcard.net.response.RegisterResponse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Observable;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RegisterPresenter extends IDCardPresenter<RegisterContract.View>
        implements RegisterContract.Presenter {

    @Inject
    protected RegisterPresenter() {
    }

    @Override
    public void onRegister(String username, String startTime, String endTime, int subjectType) {
        Date current = new Date(System.currentTimeMillis());
        long start = current.getTime() / 1000;
        long end = start + 1;

        NetApi.getInstance().register(username, start, end, subjectType)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterResponse registerResponse) {
                        if (registerResponse.getCode() == 0) {
                            mView.onRegisterSuccess();
                        } else {
                            mView.onRegisterFailed(registerResponse.getDesc());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mView.onRegisterFailed(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
