package com.example.samplechapter5.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnGotoPage2?.setOnClickListener {
            var intentGotoPage2 = Intent(this, SecondActivity::class.java)
            startActivity(intentGotoPage2)
        }
        Log.d("TESSLIFCYCLE1", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TESSLIFCYCLE1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TESSLIFCYCLE1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TESSLIFCYCLE1", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("TESSLIFCYCLE1", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TESSLIFCYCLE1", "onDestroy")
    }
}