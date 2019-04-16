package base.di.module;

import com.demo.idcard.net.NetApi;

import dagger.Module;
import dagger.Provides;

@Module
public class NetApiModule {
    @Provides
    protected NetApi provideNetApi() {
        return NetApi.getInstance();
    }
}
