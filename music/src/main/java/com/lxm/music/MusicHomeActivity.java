package com.lxm.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lxm.imageloadermanager.ImageLoaderManager;

import butterknife.ButterKnife;
import butterknife.OnClick;


@Route(path = "/music/HomeActivity")
public class MusicHomeActivity extends AppCompatActivity{

    private ImageView ivMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity_main);
        ivMain = findViewById(R.id.ivMain);

        ButterKnife.bind(this);
        ImageLoaderManager.getInstance().load(this,"http://pic36.nipic.com/20131123/8821914_083059600000_2.jpg",ivMain);
    }

    @OnClick(R2.id.ivMain)
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.ivMain) {
            Toast.makeText(MusicHomeActivity.this, "click", Toast.LENGTH_LONG).show();
        }
    }
}
