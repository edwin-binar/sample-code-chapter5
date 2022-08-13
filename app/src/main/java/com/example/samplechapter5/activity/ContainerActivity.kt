package com.example.samplechapter5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.R
import com.example.samplechapter5.databinding.ActivityContainerBinding
import com.example.samplechapter5.fragment.SampleFragment
import com.example.samplechapter5.util.SendDataFragmentToActivity

class ContainerActivity : AppCompatActivity(), SendDataFragmentToActivity {

    var binding: ActivityContainerBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val sampleFragment = SampleFragment(this,::handleDataFromFragment)
        fragmentTransaction.add(R.id.fcvSample, sampleFragment)
        fragmentTransaction.commit()
        Log.d("TESSLIFCYCLE1", "onCreate")
    }

    fun handleDataFromFragment(value: String){
        binding?.tvData?.text = value
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

    override fun onSendDataListener(value: String) {
       binding?.tvData?.text = value
    }
}