package com.lxm.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lxm.imageloadermanager.ImageLoaderManager;


@Route(path = "/music/HomeActivity")
public class MusicHomeActivity extends AppCompatActivity {

    private ImageView ivMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity_main);
        ivMain = findViewById(R.id.ivMain);

        ImageLoaderManager.getInstance().load(this,"http://pic36.nipic.com/20131123/8821914_083059600000_2.jpg",ivMain);
    }
}
