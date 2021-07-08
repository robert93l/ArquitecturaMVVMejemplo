package com.roberto1.arquitecturamvvmejemplo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.roberto1.arquitecturamvvmejemplo.model.QuoteModel
import com.roberto1.arquitecturamvvmejemplo.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
    }

