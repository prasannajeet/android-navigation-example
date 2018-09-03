package com.example.prasa.navsample.ui.welcome


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prasa.navsample.R
import kotlinx.android.synthetic.main.fragment_welcome_with_age.*

/**
 * A simple [Fragment] subclass.
 *
 */
class WelcomeMeWithAgeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_with_age, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentArgs = WelcomeMeWithAgeFragmentArgs.fromBundle(arguments)
        val name = fragmentArgs.myname
        val age = fragmentArgs.myage

        welcomewithNameandAge.text = "Welcome $name! Your age is $age"
    }
}
