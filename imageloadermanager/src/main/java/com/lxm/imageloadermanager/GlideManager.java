package com.lxm.imageloadermanager;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by lixiaoming on 2018/6/7.
 */

public class GlideManager implements ILoad {

    private GlideManager() {

    }

    public static GlideManager getInstance() {
        return SingletonHolder.instance;
    }

    @Override
    public void load(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url).into(imageView);
    }

    @Override
    public void load(Context context, String url, int placeLoading, ImageView imageView) {
        Glide.with(context).load(url).placeholder(placeLoading).into(imageView);
    }

    @Override
    public void load(Context context, String url, int placeLoading, int placeError, ImageView imageView) {
        Glide.with(context).load(url).placeholder(placeLoading).error(placeError).into(imageView);
    }

    @Override
    public void load(Context context, int resourceId, ImageView imageView) {
        Glide.with(context).load(resourceId).into(imageView);
    }

    @Override
    public void load(Context context, int resourceId, int placeLoading, ImageView imageView) {
        Glide.with(context).load(resourceId).placeholder(placeLoading).into(imageView);
    }

    @Override
    public void load(Context context, int resourceId, int placeLoading, int placeError, ImageView imageView) {
        Glide.with(context).load(resourceId).placeholder(placeLoading).error(placeError).into(imageView);
    }

    private static class SingletonHolder {
        private static final GlideManager instance = new GlideManager();
    }

}
