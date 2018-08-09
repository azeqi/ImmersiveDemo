package com.example.okgo.test;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=21){//沉浸效果 5.0及以上系统支持
            View decorView=getWindow().getDecorView();//获取当前界面的 DecorView
//          1.  int option=View.SYSTEM_UI_FLAG_FULLSCREEN;//设置系统 UI 元素可见性 -- 全屏
//          3.  int option=View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE;//两个 flag 必须同时使用，表示会让应用主体内容占用系统状态栏空间
//          2.  int option = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION   | View.SYSTEM_UI_FLAG_FULLSCREEN;//隐藏导航栏
            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
            getWindow().setStatusBarColor(Color.TRANSPARENT);

            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);//将状态栏设置为透明

        }
        ActionBar actionBar=getSupportActionBar();

        actionBar.hide();
    }

    /**
     * 需要真正沉浸模式时，只需要重写 onWindowFocusChanged 方法，然后添加以下逻辑
     * @param hasFocus
     */

//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
//            View decorView = getWindow().getDecorView();
//            decorView.setSystemUiVisibility(
//                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                            | View.SYSTEM_UI_FLAG_FULLSCREEN
//                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
//        }
//
//    }
}
