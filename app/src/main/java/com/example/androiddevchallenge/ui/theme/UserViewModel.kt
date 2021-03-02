package com.example.androiddevchallenge.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {
    var favItems by mutableStateOf(listOf<Int>())
        private set

    fun addOrRemoveFav(id: Int) {
        val pos = favItems.indexOf(id)
        favItems = if (pos != -1) {
            favItems.toMutableList().also {
                it.removeAt(pos)
            }
        } else {
            favItems.toMutableList().also {
                it.add(id)
            }
        }
    }

    fun didFav(id: Int) = favItems.indexOf(id) != -1
}