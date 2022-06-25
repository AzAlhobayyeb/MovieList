package com.example.movielist

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Movie List", modifier = Modifier,
                fontSize = 20.sp
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                Button(onClick = { }, Modifier.padding(4.dp)) {
                    Text(text = "Top 250 Movie")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "Drama")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "Histroy")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "Love")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "best2022")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "best2021")
                }
                Button(onClick = { /*TODO*/ }, Modifier.padding(4.dp)) {
                    Text(text = "War")
                }

            }
            LazyVerticalGrid(cells = GridCells.Fixed(1)) {
                items(newsData()) {
                    NewsList(it)
                }
            }
        }
    }

}