package com.example.movielist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieCard(movieData: MovieData){
    Card(modifier = Modifier
        .background(Color.Yellow)
        .requiredHeight(100.dp)
        .fillMaxWidth()
        .border(width = 1.dp,color = Color.DarkGray)
        .padding(4.dp)

    ) {
        Box(modifier = Modifier){

        }
        Row(modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Image(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.3f),
                painter = painterResource(id = movieData.imageRes),
                contentDescription = "${movieData.name}",
                contentScale = ContentScale.None,
            )

            Text(text = "${movieData.name}", modifier = Modifier.align(Alignment.CenterVertically))
            Text(text = "${movieData.rating}", modifier = Modifier.align(Alignment.CenterVertically))

        }

    }}
