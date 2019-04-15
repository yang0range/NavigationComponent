package com.demo.navigationcomponent


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


/**
 * @author yangzc
 *
 */
class TwoFragment : Fragment() {
    private val logTag = "TwoFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(logTag,"222222")
        view?.findViewById<Button>(R.id.button_two)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.action_twoFragment_to_oneFragment)
            }
        }
    }


}
