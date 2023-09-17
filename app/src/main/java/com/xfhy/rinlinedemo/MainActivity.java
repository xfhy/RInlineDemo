package com.xfhy.rinlinedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.xfhy.mylibrary.MyActivity;
import com.xfhy.mylibrary2.MySecondActivity;

/**
 * @author : xfhy
 * Create time : 2023/9/17 20:29
 * Description :
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, MyActivity.class));
        startActivity(new Intent(this, MySecondActivity.class));
    }
}
