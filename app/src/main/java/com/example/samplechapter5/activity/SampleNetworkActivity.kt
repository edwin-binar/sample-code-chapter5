package com.example.samplechapter5.activity

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.samplechapter5.R
import com.example.samplechapter5.databinding.ActivitySampleNetworkBinding
import com.google.android.material.snackbar.Snackbar
import java.security.Permission

class SampleNetworkActivity : AppCompatActivity() {

    var binding: ActivitySampleNetworkBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleNetworkBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            Glide.with(this@SampleNetworkActivity).load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .into(ivShowImage)
        }


        val checkPermission = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
        if (checkPermission == PackageManager.PERMISSION_GRANTED){
            val snackbar = binding?.root?.let { Snackbar.make(it,"Permission Allowed", Snackbar.LENGTH_INDEFINITE) }

            snackbar?.setAction("Close") {
                snackbar.dismiss()
            }
            snackbar?.show()
        }else{
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),200)
        }

    }
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 200){
            if (permissions.isNotEmpty() && grantResults.firstOrNull() == PackageManager.PERMISSION_GRANTED){
                val snackbar = binding?.root?.let { Snackbar.make(it,"Permission Allowed", Snackbar.LENGTH_INDEFINITE) }
                snackbar?.setAction("Close") {
                    snackbar.dismiss()
                }
                snackbar?.show()
            }else{
                val snackbar = binding?.root?.let { Snackbar.make(it,"User Deny Permission", Snackbar.LENGTH_INDEFINITE) }
                snackbar?.setAction("Close") {
                    snackbar.dismiss()
                }
                snackbar?.show()
            }
        }
    }
}