package com.bawei.jiajianhai.jinritoutiao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bawei.jiajianhai.jinritoutiao.R;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        ImageView imageView = (ImageView) findViewById(R.id.image);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);

                startActivity(intent);
                finish();
            }
        },1000);

    }
}
