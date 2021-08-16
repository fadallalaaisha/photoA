package com.example.photoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class Job5 : AppCompatActivity() {
    lateinit var spGender:Spinner
    lateinit var btnSubmitR:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job5)

      gender()
    }
    fun gender(){
        spGender=findViewById(R.id.spGender)
        btnSubmitR=findViewById(R.id.btnSubmitR)


        var gender= arrayOf("Female","Male","Others")
        var adapter= ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter
    }

}