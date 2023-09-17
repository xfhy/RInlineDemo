package com.xfhy.rinlinedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xfhy.mylibrary.MyActivity
import com.xfhy.mylibrary2.MySecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, MyActivity::class.java))
        startActivity(Intent(this, MySecondActivity::class.java))
    }
}