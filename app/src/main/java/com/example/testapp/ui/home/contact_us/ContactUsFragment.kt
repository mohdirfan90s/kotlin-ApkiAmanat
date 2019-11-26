package com.example.testapp.ui.home.contact_us

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.testapp.R

class ContactUsFragment : Fragment() {

    companion object {
        fun newInstance() = ContactUsFragment()
    }

    private lateinit var viewModel: ContactUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contact_us, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactUsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
