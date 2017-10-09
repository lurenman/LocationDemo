package com.example.administrator.locationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView tv_BaiDuDemo;
    private TextView tv_lianxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_BaiDuDemo = (TextView) findViewById(R.id.tv_BaiDuDemo);
        tv_lianxi = (TextView) findViewById(R.id.tv_lianxi);
        tv_BaiDuDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,BaiDuDemoActivity.class);
                startActivity(intent);
            }
        });
        tv_lianxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ExerciseActivity.class);
                startActivity(intent);
            }
        });
    }
}
