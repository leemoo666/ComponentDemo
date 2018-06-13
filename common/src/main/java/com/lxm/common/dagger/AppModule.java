package com.lxm.common.dagger;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lixiaoming on 2018/6/8.
 */


@Module
public class AppModule {

    private Context context;

    public AppModule(Application application) {
        context = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public Resources provideResources() {
        return context.getResources();
    }

}
