package com.example.movielist

import android.icu.text.CaseMap

data class NewsData(val title: String, val info: String, val imageRes: Int)

fun newsData() = mutableListOf(
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    NewsData("Spider-Man", "Spider-Man: No Way Home", R.drawable.m_m),
    )
