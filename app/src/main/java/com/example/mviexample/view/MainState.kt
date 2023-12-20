package com.example.mviexample.view

import com.example.mviexample.model.Animal

sealed class MainState {
    object idle: MainState()
    object loading: MainState()
    data class Animals(val animals: List<Animal>): MainState()
    data class Error(val error: String?): MainState()
}
