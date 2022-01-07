package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id:String,val firstName: String, val lastname:String ,val email:String)

val customerStorage = mutableListOf<Customer>()