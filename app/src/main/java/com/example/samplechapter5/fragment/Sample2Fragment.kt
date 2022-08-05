package com.example.samplechapter5.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.samplechapter5.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Sample2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Sample2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample2, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Sample2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Sample2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TESSFRAGMENT2","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("TESSFRAGMEN2T","onResume")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TESSFRAGMENT2","onAttach")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TESSFRAGMENT2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TESSFRAGMENT2","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TESSFRAGMENT2","onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TESSFRAGMENT2","onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TESSFRAGMENT2","onDetach")
    }
}