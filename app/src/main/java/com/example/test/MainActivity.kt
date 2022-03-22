package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtn= findViewById(R.id.btn_go_to_second_Activity)
        mBtn.setOnClickListener {
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}