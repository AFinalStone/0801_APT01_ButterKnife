package com.afs.app;

import android.app.Application;

import com.afs.applike.lifecycle.AppLikeLifeCycleManager;

public class AFApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initAppLikes();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        AppLikeLifeCycleManager.terminate();
    }

    /**
     * 初始化各个模块的AppLike
     */
    private void initAppLikes() {
        registerAppLikes();
        AppLikeLifeCycleManager.init(this);
    }

    /**
     * 注册当前启动的所有模块的AppLike
     */
    private void registerAppLikes() {

    }
}
