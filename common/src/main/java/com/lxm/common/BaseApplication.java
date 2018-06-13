package com.lxm.common;

import android.app.Application;

import com.lxm.common.dagger.AppModule;
import com.lxm.common.dagger.DaggerAppComponent;
//import com.lxm.common.dagger.DaggerAppComponent;

/**
 * Created by lixiaoming on 2018/6/7.
 */

public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder().appModule(new AppModule(this))
                .build();
    }

}
