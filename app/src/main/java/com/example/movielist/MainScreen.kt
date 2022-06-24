package com.example.movielist

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import org.intellij.lang.annotations.JdkConstants


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
            Text(text = "By IMDB", fontSize = 16.sp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "Top 250 Movie")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "Drama")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "Histroy")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "Love")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "best2022")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "best2021")
                }
                Button(onClick = { /*TODO*/ },Modifier.padding(4.dp)) {
                    Text(text = "War")
                }

            }
            LazyColumn(modifier = Modifier
                .background(Color.Red)
                .padding(4.dp)
                .verticalScroll(
                    rememberScrollState(),
                )){
                newsData().forEach{
                  //  NewsList(it)
                }


            }


        }


    }

}