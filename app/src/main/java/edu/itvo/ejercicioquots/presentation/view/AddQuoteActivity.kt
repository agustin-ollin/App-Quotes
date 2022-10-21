package edu.itvo.ejercicioquots.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.itvo.ejercicioquots.R
import edu.itvo.ejercicioquots.databinding.ActivityAddQuoteBinding

class AddQuoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddQuoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnAddQuote.setOnClickListener {

            }
        }
    }


}