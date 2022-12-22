package com.rudneydedy.repository

import com.rudneydedy.db.Database.TRANSACTIONS
import com.rudneydedy.entity.Transaction

class TransactionRepository: JpaRepository<Transaction, Long> {
    override fun save(e: Transaction): Int {
        TRANSACTIONS.add(e)
        return 1
    }

    override fun findBy(id: Long): Transaction? = TRANSACTIONS.firstOrNull{ transaction -> transaction.id == id }

    override fun findAll(): List<Transaction> = TRANSACTIONS

    fun findAllBy(userId: Long): List<Transaction> = TRANSACTIONS.filter { transaction -> transaction.userId == userId }
}