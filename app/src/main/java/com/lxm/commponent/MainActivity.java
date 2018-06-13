package com.lxm.commponent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lixiaoming on 2018/6/7.
 *
 */

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        findViewById(R.id.toMusic).setOnClickListener(this);
//        findViewById(R.id.toReader).setOnClickListener(this);
//        findViewById(R.id.toMain).setOnClickListener(this);
    }

    @OnClick({R.id.toMusic,R.id.toReader,R.id.toMain})
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toMusic:
                Log.i("lxm","跳到音乐");
                ARouter.getInstance().build("/music/HomeActivity").navigation();
                break;
            case R.id.toReader:
                Log.i("lxm","跳到阅读");
                ARouter.getInstance().build("/reader/HomeActivity").navigation();
                break;
            case R.id.toMain:
                Log.i("lxm","跳到主页");
                ARouter.getInstance().build("/home/HomeActivity").navigation();
                break;
        }
    }
}
