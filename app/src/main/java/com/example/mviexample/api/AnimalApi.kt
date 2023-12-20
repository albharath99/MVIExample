package com.example.mviexample.api

import com.example.mviexample.model.Animal
import retrofit2.http.GET

interface AnimalApi {
    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}