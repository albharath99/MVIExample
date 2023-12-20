package com.example.mviexample.api

class AnimalRepo(private val api: AnimalApi) {
     suspend fun getAnimals() = api.getAnimals()
}