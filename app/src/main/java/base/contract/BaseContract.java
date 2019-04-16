package base.contract;

import android.support.annotation.LayoutRes;


public interface BaseContract {

    interface Presenter<V extends View> {
        void attachView(V baseView);

        void detachView();
    }

    interface View {
        @LayoutRes
        int getContentResource();

        void showError(String errorMessage);
    }
}
