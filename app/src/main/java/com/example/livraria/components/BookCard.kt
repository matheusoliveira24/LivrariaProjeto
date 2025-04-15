// components/BookCard.kt
package com.example.livraria.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.livraria.model.Book

@Composable
fun BookCard(book: Book, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = book.coverUrl,
            contentDescription = book.title,
            modifier = Modifier.size(120.dp, 180.dp)
        )
        Text(
            text = book.title,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = book.author,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}