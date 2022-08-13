package com.example.samplechapter5.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.samplechapter5.R
import com.example.samplechapter5.databinding.FragmentSampleBinding
import com.example.samplechapter5.dialog.CustomSampleDialog
import com.example.samplechapter5.util.SendDataFragmentToActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SampleFragment(
    val listener: SendDataFragmentToActivity? = null,
    val onSendData: ((String) -> Unit)? = null
) : Fragment() {

    var binding: FragmentSampleBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSampleBinding.inflate(layoutInflater)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            btnSendData.setOnClickListener {
//                listener?.onSendDataListener("From Fragment")
                onSendData?.invoke("From Fragment")
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("TESSFRAGMENT", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("TESSFRAGMENT", "onResume")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TESSFRAGMENT", "onAttach")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TESSFRAGMENT", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TESSFRAGMENT", "onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TESSFRAGMENT", "onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TESSFRAGMENT", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TESSFRAGMENT", "onDetach")
    }

}