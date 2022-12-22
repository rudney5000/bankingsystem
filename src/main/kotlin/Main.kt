package com.rudneydedy

import com.rudneydedy.service.TransactionService
import com.rudneydedy.service.UserService

fun main(args: Array<String>) {

    val userService = UserService()
    val transactionService = TransactionService()

    while (true){

        println("Connectez-vous!")

        println("votre username")

        val username = readln()

        if (username.equals("i", true)){
//            userService.inscription()
        }
        else{
            println("Saisissez le mot de passe: ")
            val password = readln()
            val user = userService.connexion(username = username, password = password)

            println(
                """
                    1. Appuyez (T) pour faire une transaction 
                    2. Appuyez (L) pour lister vos transactions
                """.trimIndent()
            )

            when (readln().uppercase()){
                "T" -> {
                    println("Saisissez les donnees")
                    val transaction = transactionService.createTransaction(fromCustomer = readln(), toCustomer = readln(), transferredAmount = readln(), userId = user.id)
                    user.transactions.add(transaction)
                    println(user)
                }
                "L" -> {
                    println("Vos transactions")
                    println(user.transactions)
                }
            }
        }
    }
}