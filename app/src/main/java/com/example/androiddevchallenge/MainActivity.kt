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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.UserViewModel
import dev.chrisbanes.accompanist.coil.CoilImage

class MainActivity : AppCompatActivity() {
    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp(userViewModel)
            }
        }
    }
}


// Start building your app here!
@Composable
fun MyApp(userViewModel: UserViewModel) {
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()) {
            TabBar(
                listOf("Feed", "Discover")
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(content = {
                items(animalModelList) { item ->
                    Column {
                        FeedCard(url = item.imageUrl)
                        Spacer(modifier = Modifier.height(4.dp))

                        FeedActions(item.id, userViewModel)

                        Spacer(modifier = Modifier.height(24.dp))
                    }
                }
            })
        }
    }
}

@Composable
fun TabBar(menus: List<String>) {
    val selectedPosition = remember { mutableStateOf(0) }
    Row {
        for ((index, menu) in menus.withIndex()) {
            TabBarItem(
                menu,
                index == selectedPosition.value,
            ) {
                selectedPosition.value = index
            }
            Spacer(modifier = Modifier.padding(end = 8.dp))
        }
    }
}

@Composable
fun TabBarItem(text: String, isSelected: Boolean, onClick: (() -> Unit)? = null) {
    Surface(
        shape = RoundedCornerShape(percent = 40),
        color = if (isSelected) {
            MaterialTheme.colors.onBackground
        } else {
            MaterialTheme.colors.surface
        },
        modifier = onClick?.let {
            Modifier
                .clip(RoundedCornerShape(percent = 40))
                .clickable(onClick = it)
        } ?: run { Modifier }
    ) {
        Text(
            modifier = Modifier.padding(12.dp),
            text = text,
            style = MaterialTheme
                .typography
                .subtitle1
                .copy(color = if (isSelected) {
                        MaterialTheme.colors.surface
                    } else {
                        MaterialTheme.colors.onBackground
                    }
                )
        )
    }
}

@Composable
fun FeedCard(url: String) {
    Surface(
        shape = RoundedCornerShape(size = 6.dp),

    ) {
        CoilImage(
            data = url,
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 180.dp),
            contentScale = ContentScale.FillWidth,
            fadeIn = true
        )
    }
}

@Composable
fun FeedActions(id: Int, userViewModel: UserViewModel) {
//    val didLike = remember { mutableStateOf(false) }
    Row {
        IconButton(onClick = { userViewModel.addOrRemoveFav(id) }) {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite",
                tint = if (userViewModel.didFav(id)) {
                    Color.Red
                } else {
                    LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
                }
            )
        }
        Spacer(modifier = Modifier.width(4.dp))

        IconButton(onClick = { /* doSomething() */ }) {
            Icon(Icons.Filled.Comment, contentDescription = "Comment")
        }
        Spacer(modifier = Modifier.width(4.dp))

        IconButton(onClick = { /* doSomething() */ }) {
            Icon(Icons.Filled.Share, contentDescription = "Share")
        }
        Spacer(modifier = Modifier.width(4.dp))

    }
}

//@Preview("Light Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun LightPreview() {
//    MyTheme {
//        MyApp()
//    }
//}

//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        MyApp()
//    }
//}

//@Preview("Feed Card", widthDp = 360, heightDp = 640)
//@Composable
//fun FeedCardPreview() {
//    MyTheme(darkTheme = true) {
//        FeedCard(animalModelList[0].imageUrl)
//    }
//}
