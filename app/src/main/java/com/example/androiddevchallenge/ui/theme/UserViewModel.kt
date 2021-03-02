package com.example.androiddevchallenge.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.AnimalModel
import com.example.androiddevchallenge.animalModelList

class UserViewModel: ViewModel() {
    var favItems by mutableStateOf(listOf<Int>())
        private set

    var screen by mutableStateOf(Screen.HOME.name)
        private set

    var selectedId: Int = -1

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

    fun currentScreen() = Screen.valueOf(screen)

    fun changeScreen(nextScreen: Screen, id: Int = -1) {
        screen = nextScreen.name
        selectedId = id
    }

    fun getMyFuturePet(id: Int): AnimalModel {
        return animalModelList.find { it.id == id } ?: animalModelList.random()
    }
}

enum class Screen {
    HOME,
    DETAIL
}