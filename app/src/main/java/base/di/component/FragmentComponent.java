package base.di.component;


import com.demo.idcard.fragment.LoginFragment;
import com.demo.idcard.fragment.RegisterFragment;

import base.di.module.FragmentModule;
import dagger.Component;

@Component(modules = FragmentModule.class)
public interface FragmentComponent {
    LoginFragment inject(LoginFragment fragment);

    RegisterFragment inject(RegisterFragment fragment);
}
