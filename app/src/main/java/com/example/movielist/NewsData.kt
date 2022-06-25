package com.example.movielist


data class NewsData(val title: String, val info: String, val imageRes: Int)

fun newsData() = mutableListOf(
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man's identity now revealed", R.drawable.m_m),
    )
