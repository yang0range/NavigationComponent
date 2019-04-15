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
class OneFragment : Fragment() {
   private val logTag = "OneFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(logTag,"1111")
        view?.findViewById<Button>(R.id.button_one)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.twoFragment)
            }
        }
//        button_one.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.twoFragment, null))
    }


}
