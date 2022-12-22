package com.rudneydedy.repository

import com.rudneydedy.entity.User

interface JpaRepository <E, T> {
    fun save(e: E): Int
    fun findBy(id: T): E?
    fun findAll(): List<E>
}