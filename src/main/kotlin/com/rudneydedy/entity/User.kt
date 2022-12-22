package com.rudneydedy.entity


data class User (
    var id: Long,
    var username: String,
    var email: String,
    var phoneNumber: String,
    var accountNumber: Int,
    var currentBalance: Int,
    var pays: String,
    var ville: String,
    var address: String,
    var password: String,
    var transactions : MutableList<Transaction> = mutableListOf()
)