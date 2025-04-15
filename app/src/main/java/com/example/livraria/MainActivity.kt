// MainActivity.kt
package com.example.livraria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.livraria.components.BookCard
import com.example.livraria.data.BookRepository
import com.example.livraria.model.Book
import com.example.livraria.ui.theme.LivrariaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LivrariaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BookShelfApp()
                }
            }
        }
    }
}

@Composable
fun BookShelfApp() {
    BookList(books = BookRepository.books)
}

@Composable
fun BookList(books: List<Book>, modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(books) { book ->
            BookCard(book = book)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BookShelfAppPreview() {
    LivrariaTheme {
        BookShelfApp()
    }
}