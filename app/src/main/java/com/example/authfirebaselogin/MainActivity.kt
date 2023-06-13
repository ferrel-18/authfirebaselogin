package com.example.authfirebaselogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Txt_gotoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotoregister=findViewById(R.id.TvLogin)
        Txt_gotoregister.setOnClickListener {
            val intent= Intent(this,Registration::class.java)
            startActivity(intent)
        }
    }
}