package com.rudneydedy.repository

import com.rudneydedy.db.Database.USERS
import com.rudneydedy.entity.User

class UserRepository: JpaRepository<User, Long> {
    override fun save(e: User): Int {
        USERS.add(e)
        return 1
    }

    override fun findBy(id: Long): User? = USERS.firstOrNull{user -> user.id == id }

    override fun findAll(): List<User> = USERS

    fun findByUsername(username: String): User? {
        return USERS.firstOrNull{
            user -> user.username == username
        }
    }

    fun findByAccountNumber(accountNumber: Int): User? {
        return USERS.firstOrNull{
            user -> user.accountNumber == accountNumber
        }
    }
}