package com.lxm.common.dagger;

import android.app.Application;
import android.content.Context;

import com.lxm.common.bean.User;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by lixiaoming on 2018/6/8.
 */


@Module
public class NetWorkModule {

    public static final int CONNECT_TIMEOUT_IN_MS = 30000;

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {

        return new okhttp3.OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIMEOUT_IN_MS, TimeUnit.MILLISECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit retrofit(OkHttpClient okHttpClient) {
        return new Retrofit
                .Builder()
                .baseUrl("")
//                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

//    @Singleton
//    @Provides
//    TmdbWebService tmdbWebService(Retrofit retrofit) {
//        return retrofit.create(TmdbWebService.class);
//    }
}
