package com.lxm.common.dagger;

import com.lxm.common.BaseApplication;
import com.lxm.common.dagger.detail.DetailComponent;
import com.lxm.common.dagger.detail.DetailModule;

import dagger.Component;

/**
 * Created by lixiaoming on 2018/6/8.
 */

@Component(modules = {AppModule.class,NetWorkModule.class})
public interface AppComponent {

    DetailComponent plus(DetailModule detailsModule);

//    void inject(BaseApplication application);

}
