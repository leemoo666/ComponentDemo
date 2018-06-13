package com.lxm.common.dagger.detail;

import android.app.Activity;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by lixiaoming on 2018/6/8.
 */

@Subcomponent(modules = {DetailModule.class})
public interface DetailComponent {
    void inject(Activity target);
}
