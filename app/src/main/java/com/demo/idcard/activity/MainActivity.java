package com.demo.idcard.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.demo.idcard.contract.MainContract;
import com.demo.idcard.fragment.LoginFragment;
import com.demo.menu.R;
import com.demo.idcard.presenter.MainPresenter;

import base.di.component.ActivityComponent;
import base.view.activity.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    protected void initInjects(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
    }

    @Override
    public int getContentResource() {
        return R.layout.activity_main;
    }

    private void initFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment loginFragment = fragmentManager.findFragmentByTag(LoginFragment.class.getSimpleName());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (loginFragment == null) {
            fragmentTransaction.add(R.id.fl_fragment_container_main_activity, new LoginFragment(), LoginFragment.class.getSimpleName());
        }
        fragmentTransaction.commitAllowingStateLoss();
    }
}
