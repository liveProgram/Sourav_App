package com.company.souravapp.model

import java.io.Serializable

data class Todos (
    val userId : Int,
    val id : Int,
    val title :String,
    val completed:Boolean
) : Serializable
