package com.example.samplechapter5.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.samplechapter5.databinding.LayoutDialogSampleBinding

class CustomSampleDialog(val title:String) : DialogFragment() {

    var binding: LayoutDialogSampleBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LayoutDialogSampleBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        dialog?.window?.setLayout(width,height)
        binding?.tvTitle?.text = title
        binding?.btnClose?.setOnClickListener {
            dialog?.dismiss()
        }
    }
}