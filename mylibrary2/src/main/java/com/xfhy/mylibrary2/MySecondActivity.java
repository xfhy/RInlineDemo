package com.xfhy.mylibrary2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.xfhy.baselib.BaseLibActivity;


/**
 * @author : xfhy
 * Create time : 2023/9/17 20:27
 * Description :
 */
public class MySecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);

        Log.d("xfhy", "str=" + getString(com.xfhy.baselib.R.string.base_lib_str));
        startActivity(new Intent(this, BaseLibActivity.class));
    }
}
