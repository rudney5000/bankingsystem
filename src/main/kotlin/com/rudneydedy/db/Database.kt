package com.rudneydedy.db

import com.rudneydedy.entity.Transaction
import com.rudneydedy.entity.User

object Database {
    var TRANSACTIONS: MutableList<Transaction> = mutableListOf(
        Transaction(
            id = 1,
            fromCustomer = "toto",
            toCustomer = "tata",
            transferredAmount = "80000",
            userId = 1,
        ),
        Transaction(
            id = 2,
            fromCustomer = "bobo",
            toCustomer = "baba",
            transferredAmount = "80000",
            userId = 1,
        ),
        Transaction(
            id = 3,
            fromCustomer = "opo",
            toCustomer = "papa",
            transferredAmount = "80000",
            userId = 2,
        ),
    )
    var USERS: MutableList<User> = mutableListOf(
        User(
            id = 1,
            username = "demo",
            email = "demo@email.com",
            phoneNumber = "14485212154",
            accountNumber = 22233,
            currentBalance = 5000,
            pays = "Russia",
            ville = "Moscow",
            address = "Lenine Street",
            password = "password",
            transactions = mutableListOf(Transaction(
                id = 1,
                fromCustomer = "toto",
                toCustomer = "tata",
                transferredAmount = "80000",
                userId = 1,
            ))
        ),
        User(
            id = 2,
            username = "admin",
            email = "admin@email.com",
            phoneNumber = "555558454",
            accountNumber = 55512,
            currentBalance = 5000,
            pays = "Russia",
            ville = "Ufa",
            address = "Pushkin Street",
            password = "password",
            transactions = mutableListOf(Transaction(
                id = 2,
                fromCustomer = "bobo",
                toCustomer = "baba",
                transferredAmount = "85000",
                userId = 1,
            ))
        ),
    )
}