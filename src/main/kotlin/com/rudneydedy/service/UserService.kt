package com.rudneydedy.service

import com.rudneydedy.entity.User
import com.rudneydedy.repository.UserRepository

class UserService(private val userRepository: UserRepository = UserRepository()) {

    fun inscription(user: User): String {
        if (user.username != null && user.password != null) {
            val userSaved = userRepository.save(user)
            return "Utilisateur cree"
        }
        throw  IllegalArgumentException("les donnees ne sont pas valides")
    }

    fun connexion(username: String, password: String): User {
        val userFound = userRepository.findByUsername(username)
        if (userFound != null && userFound.password == password) {
            return userFound
        }
        throw IllegalArgumentException("Ce compte n'existe pas!")
    }
}