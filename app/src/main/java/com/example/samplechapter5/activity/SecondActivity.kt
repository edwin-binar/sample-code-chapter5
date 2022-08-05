package com.example.samplechapter5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.R
import com.example.samplechapter5.databinding.ActivitySecondBinding
import com.example.samplechapter5.model.User
import com.example.samplechapter5.model.UserParcelize

class SecondActivity : AppCompatActivity() {

    companion object{
        val KEY_NAME_DATA = "dataFromMainPage"
        val KEY_USER = "KEY_USER"
        val KEY_USER_PARCELIZE = "KEY_USER_PARCELIZE"

    }

    var binding: ActivitySecondBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val data = intent.getStringExtra(KEY_NAME_DATA)
        val user = intent.getSerializableExtra(KEY_USER) as User

        val userParcelize = intent.getParcelableExtra<UserParcelize>(KEY_USER_PARCELIZE)

        binding?.apply {
            tvShowData.text = userParcelize?.name.orEmpty()
        }
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