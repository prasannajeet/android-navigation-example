package com.example.prasa.navsample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.prasa.navsample.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sending data from one fragment to another fragment
        goToDetailFragment.setOnClickListener{

            val name = editTextName.text.toString()
            if(isTextEmpty(name)) {
                editTextName.error = "Please enter a name"
            } else {
                val action = MainFragmentDirections.actionListToDetail()
                action.setMyname(name)
                findNavController().navigate(action)
            }
        }

        // Sending data from one fragment to an activity
        goToSecondActivity.setOnClickListener {

            val name = editTextName.text.toString()
            if(isTextEmpty(name)) {
                editTextName.error = "Please enter a name"
            } else {
                val action = MainFragmentDirections.actionMainToSecondActivity()
                action.setMyname(name)
                findNavController().navigate(action)
            }
        }

        gotToAgeFragment.setOnClickListener {
            val name = editTextName.text.toString()
            if(isTextEmpty(name)) {
                editTextName.error = "Please enter a name"
            } else {
                val action = MainFragmentDirections.actionMainFragmentToAgeFragment()
                action.setMyname(name)
                findNavController().navigate(action)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        editTextName.setText("")
    }

    companion object {
        fun isTextEmpty(text: String): Boolean {
            return text.isEmpty()
        }
    }
}