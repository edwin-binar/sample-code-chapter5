package com.example.samplechapter5.activity

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.samplechapter5.R
import com.example.samplechapter5.databinding.ActivitySecondBinding
import com.example.samplechapter5.dialog.CustomSampleDialog
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

//        val data = intent.getStringExtra(KEY_NAME_DATA)
//        val user = intent.getSerializableExtra(KEY_USER) as User

        val bundle = intent.extras
        val data = bundle?.getString(KEY_NAME_DATA).orEmpty()


        val userParcelize = intent.getParcelableExtra<UserParcelize>(KEY_USER_PARCELIZE)

        binding?.apply {
            tvShowData.text = data
            btnStandardDialog.setOnClickListener {
                showDialogStandard()
            }

            btnCustomDialog.setOnClickListener {
//                shoCustomDialog()
                showCustomDialogFragment()
            }
        }
        Log.d("TESSLIFCYCLE", "onCreate")

    }


    fun showDialogStandard(){
        val dialog = AlertDialog.Builder(this@SecondActivity)
        dialog.setTitle("Sample Dialog")
        dialog.setMessage("Sedang Memuncul Sample Dilaog Standart")
        dialog.setCancelable(true)
        dialog.setPositiveButton("Oke"
        ) { dialogInterface, _ ->
            dialogInterface.dismiss()
        }
        dialog.setNegativeButton("Tidak"
        ) { dialogInterface, _ ->
            dialogInterface.dismiss()
        }
        dialog.setNeutralButton("Mungkin"
        ) { dialogInterface, _ ->
            dialogInterface.dismiss()
        }
        dialog.show()
    }

    fun shoCustomDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.layout_dialog_sample)
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        dialog.window?.setLayout(width,height)

        val btnClose = dialog.findViewById<Button>(R.id.btnClose)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun showCustomDialogFragment(){
        val dialog = CustomSampleDialog("Tess")
        dialog.show(supportFragmentManager,"CustomSampleDialog")
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