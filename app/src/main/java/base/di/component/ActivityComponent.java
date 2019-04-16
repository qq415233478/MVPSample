package base.di.component;


import com.demo.idcard.activity.MainActivity;

import base.di.module.ActivityModule;
import dagger.Component;

@Component(
        modules = ActivityModule.class)
public interface ActivityComponent {

    MainActivity inject(MainActivity mainActivity);
}
