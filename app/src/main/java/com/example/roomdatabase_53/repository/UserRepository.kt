package com.example.roomdatabase_53.repository

import androidx.lifecycle.LiveData
import com.example.roomdatabase_53.data.UserDao
import com.example.roomdatabase_53.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }
}