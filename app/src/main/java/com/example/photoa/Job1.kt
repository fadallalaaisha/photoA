package com.example.photoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Job1 : AppCompatActivity() {
    lateinit var btnLog:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job1)
        next2()
    }
    fun next2(){
        btnLog=findViewById(R.id.btnLog)

        btnLog.setOnClickListener {
            val log2 = Intent(baseContext, job2::class.java)
            startActivity(log2)
    }
}}