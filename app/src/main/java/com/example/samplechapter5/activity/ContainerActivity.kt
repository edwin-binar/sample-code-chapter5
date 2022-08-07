package com.example.samplechapter5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.R
import com.example.samplechapter5.fragment.SampleFragment

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val sampleFragment = SampleFragment()
        fragmentTransaction.add(R.id.fcvSample,sampleFragment)
        fragmentTransaction.commit()
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