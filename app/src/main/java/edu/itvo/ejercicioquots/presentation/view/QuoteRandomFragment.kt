package edu.itvo.ejercicioquots.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import edu.itvo.ejercicioquots.R
import edu.itvo.ejercicioquots.databinding.ActivityMainBinding
import edu.itvo.ejercicioquots.databinding.FragmentQuoteRandomBinding
import edu.itvo.ejercicioquots.presentation.viewmodel.QuoteViewModel

class QuoteRandomFragment : Fragment() {
    private lateinit var binding: FragmentQuoteRandomBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quote_random, container, false)
    }


}