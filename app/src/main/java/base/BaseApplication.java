package base;

import android.app.Application;

import base.di.component.AppComponent;
import base.di.component.DaggerAppComponent;
import base.di.module.AppModule;
import base.di.module.NetApiModule;

public abstract class BaseApplication extends Application {

    private static BaseApplication sInstance;

    private AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .netApiModule(new NetApiModule())
                    .build();
        }
    }

    public static BaseApplication getInstance() {
        return sInstance;
    }

    public static AppComponent getAppComponent() {
        return getInstance().mAppComponent;
    }
}
