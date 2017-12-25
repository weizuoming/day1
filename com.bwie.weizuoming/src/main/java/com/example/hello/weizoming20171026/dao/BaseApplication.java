package com.example.hello.weizoming20171026.dao;

import android.app.Application;

import com.example.hello.weizoming20171026.util.ImageLoaderUtil;

/**
 * 全局配置
 * Created by 韦作铭 on 2017/10/26.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        ImageLoaderUtil.init(this);
    }
}
