package com.demo.idcard.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.demo.idcard.contract.LoginContract;
import com.demo.idcard.presenter.LoginPresenter;
import com.demo.menu.R;

import base.di.component.FragmentComponent;
import base.view.frgment.BaseFragment;
import butterknife.BindView;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment<LoginPresenter>
        implements LoginContract.View {

    @BindView(R.id.et_ip_login_fragment)
    EditText mIPEdit;
    @BindView(R.id.et_username_login_fragment)
    EditText mUsernameEdit;
    @BindView(R.id.et_password_login_fragment)
    EditText mPasswordEdit;

    @Override
    protected void initInjects(FragmentComponent fragmentComponent) {
        fragmentComponent.inject(this);
    }

    @OnClick(R.id.btn_login_fragment)
    public void onLoginClick(View view) {
        if (mPresenter != null) {
            mPresenter.onLogin(mIPEdit.getText().toString(),
                    mUsernameEdit.getText().toString(),
                    mPasswordEdit.getText().toString());
        }
    }

    @Override
    public int getContentResource() {
        return R.layout.fragment_login;
    }

    @Override
    public void loginSuccess() {
        startFragment(new RegisterFragment(), true);
    }

    @Override
    public void loginFailed(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
