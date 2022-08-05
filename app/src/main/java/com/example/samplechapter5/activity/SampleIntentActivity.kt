package com.example.samplechapter5.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.samplechapter5.R
import com.example.samplechapter5.activity.SecondActivity.Companion.KEY_NAME_DATA
import com.example.samplechapter5.activity.SecondActivity.Companion.KEY_USER
import com.example.samplechapter5.activity.SecondActivity.Companion.KEY_USER_PARCELIZE
import com.example.samplechapter5.databinding.ActivitySampleIntentBinding
import com.example.samplechapter5.model.User
import com.example.samplechapter5.model.UserParcelize

class SampleIntentActivity : AppCompatActivity() {

    var binding: ActivitySampleIntentBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleIntentBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.apply {

            //Implicit Intent
            btnWhatsapp.setOnClickListener {
                try {
                    Intent().apply {
                        setPackage("com.whatsapp")
                        type = "text/plain"
                        putExtra(Intent.EXTRA_TEXT,"From Chapter 5")
                        startActivity(this)
                    }
                }catch (e: Exception){
                    Log.d("Error Intent","Apps Tidak Ditemukan")
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")).apply {
                        startActivity(this)
                    }
                }
            }
            //Explicit Intent
            btnGotoPage2.setOnClickListener {

                val user = User("Binor","Laki-Laki")

                val userParcelize = UserParcelize("Binor","Laki-Laki")

                val intentPage2= Intent(this@SampleIntentActivity,SecondActivity::class.java)
                intentPage2.putExtra(KEY_NAME_DATA,"From Main Page")
                intentPage2.putExtra(KEY_USER,user)
                intentPage2.putExtra(KEY_USER_PARCELIZE,userParcelize)
                startActivity(intentPage2)
            }
        }
    }
}