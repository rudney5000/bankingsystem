package com.rudneydedy.entity

import java.sql.Timestamp
import java.time.LocalDateTime

data class Transaction(
    var id: Long,
    var fromCustomer: String,
    var toCustomer: String,
    var transferredAmount: String,
    var userId: Long,
    var transactionTime: Timestamp = Timestamp.valueOf(LocalDateTime.now()),
)