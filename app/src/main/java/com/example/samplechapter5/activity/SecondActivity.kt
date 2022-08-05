package com.example.samplechapter5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("TESSLIFCYCLE", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("TESSLIFCYCLE", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TESSLIFCYCLE", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("TESSLIFCYCLE", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("TESSLIFCYCLE", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TESSLIFCYCLE", "onDestroy")
    }
}