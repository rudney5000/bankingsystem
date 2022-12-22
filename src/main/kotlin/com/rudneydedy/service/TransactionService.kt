package com.rudneydedy.service

import com.rudneydedy.db.Database.TRANSACTIONS
import com.rudneydedy.entity.Transaction
import com.rudneydedy.repository.TransactionRepository

class TransactionService(private val transactionRepository: TransactionRepository = TransactionRepository()) {
    fun getAllTransaction(): List<Transaction> = transactionRepository.findAll()

    fun createTransaction(fromCustomer: String, toCustomer: String, transferredAmount: String, userId: Long): Transaction {
        if (fromCustomer !="" && toCustomer != ""){
            val transaction = Transaction(
                id = TRANSACTIONS.size + 1L,
                fromCustomer = fromCustomer,
                toCustomer = toCustomer,
                transferredAmount = transferredAmount,
                userId = userId
            )
            transactionRepository.save(transaction)
            return transaction
        }
        throw IllegalArgumentException("Les donnes ne sont pas valides")
    }

    fun getTransactionsByUser(userId: Long): List<Transaction> = transactionRepository.findAllBy(userId)

}