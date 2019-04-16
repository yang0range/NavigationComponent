package com.demo.navigationcomponent


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_three.*


/**
 * @author yangzc
 *
 */
class ThreeFragment : Fragment() {
private val logTag = "ThreeFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_three.setOnClickListener {
                findNavController().navigate(R.id.action_threeFragment_to_fourFragment)
        }
    }

}
