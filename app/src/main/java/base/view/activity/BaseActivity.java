package base.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import base.contract.BaseContract;
import base.di.component.DaggerActivityComponent;

import javax.inject.Inject;

import base.di.component.ActivityComponent;
import butterknife.ButterKnife;


public abstract class BaseActivity<T extends BaseContract.Presenter> extends AppCompatActivity implements BaseContract.View {

    @Inject
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResource());
        initInjects(DaggerActivityComponent.builder().build());

        ButterKnife.bind(this);
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void showError(String errorMessage) {

    }

    protected abstract void initInjects(ActivityComponent activityComponent);
}
