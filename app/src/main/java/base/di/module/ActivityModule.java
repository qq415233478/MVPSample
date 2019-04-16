package base.di.module;


import base.view.activity.BaseActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule extends BaseModule {
    private BaseActivity mActivity;

    public ActivityModule(BaseActivity activity) {
        this.mActivity = activity;
    }


    @Provides
    public BaseActivity provideActivity() {
        return mActivity;
    }
}
