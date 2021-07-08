package com.roberto1.arquitecturamvvmejemplo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.roberto1.arquitecturamvvmejemplo.databinding.ActivityMainBinding
import com.roberto1.arquitecturamvvmejemplo.viewmodel.QuoteViewModel
import androidx.lifecycle.Observer
import kotlin.text.Typography.quote


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author

        })


        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}



