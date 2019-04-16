package com.demo.navigationcomponent


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_two.*


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
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_two.setOnClickListener {
            findNavController().navigate(R.id.action_twoFragment_to_threeFragment)
        }
        }

    }


