package com.company.souravapp.config

import retrofit2.Retrofit

object Api {
   private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private fun configure(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()  // retrofit object configuration
    }

    val apiCall: UrlList = configure().create(UrlList::class.java)
}