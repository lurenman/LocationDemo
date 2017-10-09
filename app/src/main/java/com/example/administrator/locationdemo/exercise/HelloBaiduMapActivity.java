package com.example.administrator.locationdemo.exercise;

import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;
import com.example.administrator.locationdemo.BaseActivity;
import com.example.administrator.locationdemo.R;

/**
 * Created by Administrator on 2017/9/28.
 *  这个定位位置默认是天安门
 */

public class HelloBaiduMapActivity extends BaseActivity {
    MapView mMapView = null;
    @Override
    protected void initVariables() {
        MapStatus.Builder builder = new MapStatus.Builder();
        //定位到益乐新村
        LatLng center = new LatLng(30.2950978975,120.1162394375);
        float zoom = 11.0f; // 默认 11级
        builder.target(center).zoom(zoom);
    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_hellobaidumap);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.bmapView);

    }

    @Override
    protected void loadData() {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
}
