package base.di.module;

import base.view.frgment.BaseFragment;
import dagger.Module;
import dagger.Provides;


@Module
public class FragmentModule extends BaseModule {
    BaseFragment mFragment;

    public FragmentModule(BaseFragment fragment) {
        this.mFragment = fragment;
    }


    @Provides
    BaseFragment provideFragment() {
        return mFragment;
    }
}
