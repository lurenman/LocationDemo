package com.example.administrator.locationdemo.map;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.SupportMapFragment;
import com.baidu.mapapi.model.LatLng;
import com.example.administrator.locationdemo.R;


public class MapFragmentDemo extends FragmentActivity {
    @SuppressWarnings("unused")
    private static final String LTAG = MapFragmentDemo.class.getSimpleName();
    SupportMapFragment map;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Intent intent = getIntent();
        MapStatus.Builder builder = new MapStatus.Builder();
        //定位到益乐新村
        if (intent.hasExtra("x") && intent.hasExtra("y")) {
            // 当用intent参数时，设置中心点为指定点
            Bundle b = intent.getExtras();
            LatLng p = new LatLng(b.getDouble("y"), b.getDouble("x"));
            builder.target(p);
        }
        //设置地图俯仰角
        builder.overlook(-180).zoom(15);

/*        compassEnabled(boolean enabled)设置是否允许指南针，默认允许。
        mapStatus(MapStatus status)设置地图初始化时的地图状态， 默认地图中心点为北京天安门，缩放级别为 12.0f
        zoomControlsEnabled(boolean enabled)    设置是否显示缩放控件*/

        BaiduMapOptions bo = new BaiduMapOptions().mapStatus(builder.build())
                .compassEnabled(true).zoomControlsEnabled(true);
        map = SupportMapFragment.newInstance(bo);
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.map, map, "map_fragment").commit();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}
