package com.lxm.imageloadermanager;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by lixiaoming on 2018/6/7.
 */

public class ImageLoaderManager implements ILoad{

    public static ImageLoaderManager getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final ImageLoaderManager instance = new ImageLoaderManager();
    }

    private ILoad imageLoader;

    private ImageLoaderManager() {
        imageLoader = GlideManager.getInstance();
    }

    @Override
    public void load(Context context, String url, ImageView imageView) {
        imageLoader.load(context,url,imageView);
    }

    @Override
    public void load(Context context, String url, int placeLoading, ImageView imageView) {
        imageLoader.load(context,url,placeLoading,imageView);
    }

    @Override
    public void load(Context context, String url, int placeLoading, int placeError, ImageView imageView) {
        imageLoader.load(context,url,placeLoading,placeError,imageView);
    }

    @Override
    public void load(Context context, int resourceId, ImageView imageView) {
        imageLoader.load(context,resourceId,imageView);
    }

    @Override
    public void load(Context context, int resourceId, int placeLoading, ImageView imageView) {
        imageLoader.load(context,resourceId,placeLoading,imageView);
    }

    @Override
    public void load(Context context, int resourceId, int placeLoading, int placeError, ImageView imageView) {
        imageLoader.load(context,resourceId,placeLoading,placeError,imageView);
    }
}
