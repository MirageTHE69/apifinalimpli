package com.example.domain.repository

import com.example.domain.model.create_User_Model
import com.example.domain.model.user
import retrofit2.Response

interface UserRepository {

    suspend fun  getUser() : Response<List<user>>
    suspend fun  createUser(email : String , password : String) : Response<List<create_User_Model>>
    suspend fun  getUserById(UserId : String) : Response<create_User_Model>

}