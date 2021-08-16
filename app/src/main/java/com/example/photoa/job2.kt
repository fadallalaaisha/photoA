package com.example.photoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class job2 : AppCompatActivity() {
    lateinit var btnApply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job2)

        applyEn()
    }
    fun applyEn(){
        btnApply=findViewById(R.id.btnApply)

        btnApply.setOnClickListener {
            var ApplyE = Intent(baseContext,Job3::class.java)
            startActivity(ApplyE)
        }
    }
}