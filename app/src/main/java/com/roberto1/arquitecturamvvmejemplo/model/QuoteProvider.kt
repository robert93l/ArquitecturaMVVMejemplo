package com.roberto1.arquitecturamvvmejemplo.model


class QuoteProvider {
    companion object{
    fun random():QuoteModel{
        val position = (0..2).random()
        return quote[position]
    }

    private val quote = listOf<QuoteModel>(
        QuoteModel(
            quote = "its noot a bug motherfucker",
            author = "anomimo bitcher"
        ),
        QuoteModel(
            quote = "i dont care bitches",
                    author = "bill gates"
        ),
        QuoteModel(
            quote = "medidas anticovid",
                    author = "covid 19 pandemia"
        ),)
}}