package com.lxm.common.dagger.detail;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.lxm.common.bean.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lixiaoming on 2018/6/8.
 */


@Module
public class DetailModule {

    @Provides
    User provideInteractor() {
        return new User();
    }
}
