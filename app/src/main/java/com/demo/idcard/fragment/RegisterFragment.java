package com.demo.idcard.fragment;

import android.widget.Button;
import android.widget.EditText;

import com.demo.idcard.contract.RegisterContract;
import com.demo.idcard.presenter.RegisterPresenter;
import com.demo.menu.R;

import base.di.component.FragmentComponent;
import base.view.frgment.BaseFragment;
import butterknife.BindView;
import butterknife.OnClick;

public class RegisterFragment extends BaseFragment<RegisterPresenter>
        implements RegisterContract.View {

    @BindView(R.id.et_name_register_fragment)
    EditText mNameEdit;

    @BindView(R.id.et_start_time_register_fragment)
    EditText mStartTimeEdit;

    @BindView(R.id.et_end_time_register_fragment)
    EditText mEndTimeEdit;

    @BindView(R.id.btn_register_fragment)
    Button mRegisterButton;

    @Override
    protected void initInjects(FragmentComponent fragmentComponent) {
        fragmentComponent.inject(this);
    }

    @Override
    public int getContentResource() {
        return R.layout.fragment_register;
    }


    @OnClick(R.id.btn_register_fragment)
    public void onRegisterClick() {
        if (mPresenter != null) {
            mPresenter.onRegister(mNameEdit.getText().toString()
                    , mStartTimeEdit.getText().toString()
                    , mEndTimeEdit.getText().toString());
        }
    }

    @Override
    public void onRegisterSuccess() {

    }

    @Override
    public void onRegisterFailed(String errorMessage) {

    }
}
