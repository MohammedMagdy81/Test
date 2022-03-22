package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    lateinit var mBtnSubmit:Button
    lateinit var mEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mBtnSubmit= findViewById(R.id.btn_submit)
        mEditText= findViewById(R.id.et_uri)

        mBtnSubmit.setOnClickListener {
            val uri = mEditText.text.toString()
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            startActivity(intent)
        }
    }
}