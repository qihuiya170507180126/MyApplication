package com.example.qby.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate方法，党在各个节目创建时，会自动的进行回调
        //在其中完成一些初始化的工作：设置界面样式（布局文件）：设置界面的响应
        super.onCreate(savedInstanceState);// 调用父类的方法，不可忽略
        setContentView(R.layout.activity_main);//设置界面的样式

        int a=1;


        //进行日志的输出（演示）
        Log.i(MainActivity.class.toString(),"content");
    }
}