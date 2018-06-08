package com.lxm.imageloadermanager;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by lixiaoming on 2018/6/7.
 */

public interface ILoad {

    /**
     * 默认加载图片
     * @param context
     * @param url
     * @param imageView
     */
    void load(Context context, String url, ImageView imageView);
    void load(Context context, String url, int placeLoading, ImageView imageView);
    void load(Context context, String url, int placeLoading, int placeError, ImageView imageView);

    void load(Context context, int resourceId, ImageView imageView);
    void load(Context context, int resourceId, int placeLoading, ImageView imageView);
    void load(Context context, int resourceId, int placeLoading, int placeError, ImageView imageView);

}
