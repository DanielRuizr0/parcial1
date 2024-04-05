package com.example.parcial1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Avanzar() {
        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
     fun mandarinfo(){

     }
}