package base.view.frgment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.demo.menu.R;

import javax.inject.Inject;

import base.contract.BaseContract;
import base.di.component.DaggerFragmentComponent;
import base.di.component.FragmentComponent;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<T extends BaseContract.Presenter> extends Fragment implements BaseContract.View {

    @Inject
    protected T mPresenter;

    protected View mRootView;

    protected Unbinder mUnbinder;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initInjects(DaggerFragmentComponent.builder().build());
        mRootView = inflater.inflate(getContentResource(), container, false);
        mUnbinder = ButterKnife.bind(this, mRootView);
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        return mRootView;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public void startFragment(BaseFragment fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fl_fragment_container_main_activity, fragment, fragment.getClass().getSimpleName());
            if (addToBackStack) {
                transaction.addToBackStack(fragment.getClass().getSimpleName());
            }
            transaction.commitAllowingStateLoss();
        }
    }

    @Override
    public void showError(String errorMessage) {
        Toast.makeText(getContext(), "error:" + errorMessage, Toast.LENGTH_SHORT).show();
    }

    protected abstract void initInjects(FragmentComponent fragmentComponent);
}
