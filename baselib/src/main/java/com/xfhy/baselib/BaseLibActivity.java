package com.xfhy.baselib;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseLibActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_lib);

        int a = R.id.btn_base_library;
        int a1 = R.id.btn_base_library1;
        int a2 = R.id.btn_base_library2;
        int a3 = R.id.btn_base_library3;
        Log.d("xfhy", "a=" + a + " a1=" + a1 + " a2=" + a2 + " a3=" + a3);
    }
}
