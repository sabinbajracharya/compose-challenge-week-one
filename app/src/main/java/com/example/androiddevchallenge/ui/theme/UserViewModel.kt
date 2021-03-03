/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.AnimalModel
import com.example.androiddevchallenge.animalModelList

class UserViewModel : ViewModel() {
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
