package com.example.photoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSign: Button
    lateinit var btnLogIn: Button
    lateinit var btnClick:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click1()
    }

    fun click1() {
        btnLogIn = findViewById(R.id.btnLogIn)
        btnSign = findViewById(R.id.btnSign)
        btnClick=findViewById(R.id.btnClick)

        btnLogIn.setOnClickListener {
            val intent = Intent(baseContext, Job1::class.java)
            startActivity(intent)

            btnSign.setOnClickListener {
                val signUp = Intent(baseContext, Job5::class.java)
                startActivity(signUp)

                btnClick.setOnClickListener {
                    val click = Intent(baseContext, job2::class.java)
                    startActivity(click)
                }
            }
        }
    }
}