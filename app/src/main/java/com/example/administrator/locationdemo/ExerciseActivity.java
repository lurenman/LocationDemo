package com.example.administrator.locationdemo;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.locationdemo.exercise.HelloBaiduMapActivity;

/**
 * Created by Administrator on 2017/9/28.
 */

public class ExerciseActivity extends BaseActivity {
    private TextView tv_HelloBaiduMap;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_exercise);
        tv_HelloBaiduMap = (TextView) findViewById(R.id.tv_HelloBaiduMap);
    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        tv_HelloBaiduMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HelloBaiduMapActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
