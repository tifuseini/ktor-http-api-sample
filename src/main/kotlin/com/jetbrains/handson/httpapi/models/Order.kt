package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Order(val number: String,val content: List<OrderItem>)

@Serializable
data class OrderItem(val item: String,val amount:Int,val price:Double)

val orderStorage = listOf(Order(
    "2021-01-97", listOf(
        OrderItem("Ham Sandwich",3,5.60),
        OrderItem("Water",1,2.50),
        OrderItem("Beer",6,10.60)
    )),
    Order("2020-04-03-01", listOf(
        OrderItem("Cheeseburger", 1, 8.50),
        OrderItem("Water", 2, 1.50),
        OrderItem("Coke", 2, 1.76),
        OrderItem("Ice Cream", 1, 2.35)
    ))
)