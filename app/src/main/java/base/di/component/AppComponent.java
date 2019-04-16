package base.di.component;


import android.content.Context;

import com.demo.idcard.net.NetApi;

import base.di.module.NetApiModule;

import javax.inject.Singleton;

import base.di.module.AppModule;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetApiModule.class})
public interface AppComponent {

    Context getContext();

    NetApi getNetApi();

}
