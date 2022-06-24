package com.example.movielist


import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.ui.Modifier
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MovieScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp, 20.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyVerticalGrid(
                cells = GridCells.Fixed(1),

                ) {

                item(span = { GridItemSpan(1) }) {

                    Box(modifier = Modifier.fillMaxWidth().height(60.dp)) {

                        Text(
                            text = "Top 250 Movie by IMDB",
                            fontSize = 20.sp,
                            modifier = Modifier.align(
                                Alignment.TopCenter
                            )
                        )
                        Text(
                            text = "Poster", modifier = Modifier.align(
                                Alignment.BottomStart
                            )
                        )
                        Text(
                            text = "Rank $ Title",
                            modifier = Modifier.align(
                                Alignment.BottomCenter
                            )
                        )
                        Text(
                            text = "Riting",
                            modifier = Modifier.align(
                                Alignment.BottomEnd
                            )
                        )
                    }
                }

                items(moviesList()) {
                    MovieCard(it)
                }
            }
        }
    }
}