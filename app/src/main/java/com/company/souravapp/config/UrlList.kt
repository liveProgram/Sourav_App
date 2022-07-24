package com.company.souravapp.config

import com.company.souravapp.model.Todos
import retrofit2.Response
import retrofit2.http.GET

interface UrlList {
    @GET("todos/")
    suspend fun getTodos() : Response<ArrayList<Todos>>
}