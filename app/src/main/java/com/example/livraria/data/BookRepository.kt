// data/BookRepository.kt
package com.example.livraria.data

import com.example.livraria.model.Book

object BookRepository {
    val books = listOf(
        Book(1, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "https://m.media-amazon.com/images/I/719qvYx99qL._AC_UF1000,1000_QL80_.jpg"),
        Book(2, "Dom Casmurro", "Machado de Assis", "https://m.media-amazon.com/images/I/61x993lW1ZL._AC_UF1000,1000_QL80_.jpg"),
        Book(3, "Cem Anos de Solidão", "Gabriel García Márquez", "https://m.media-amazon.com/images/I/71QL0U1GzAL._AC_UF1000,1000_QL80_.jpg"),
        Book(4, "1984", "George Orwell", "https://m.media-amazon.com/images/I/71b6+57vrHL._AC_UF1000,1000_QL80_.jpg"),
        Book(5, "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "https://m.media-amazon.com/images/I/71jLBXtWJIL._AC_UF1000,1000_QL80_.jpg"),
        Book(6, "Orgulho e Preconceito", "Jane Austen", "https://m.media-amazon.com/images/I/71qQ9rKz2dL._AC_UF1000,1000_QL80_.jpg"),
        Book(7, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "https://m.media-amazon.com/images/I/81ebFq-nFJL._AC_UF1000,1000_QL80_.jpg"),
        Book(8, "A Metamorfose", "Franz Kafka", "https://m.media-amazon.com/images/I/61uK57Fq7GL._AC_UF1000,1000_QL80_.jpg"),
        Book(9, "O Sol é Para Todos", "Harper Lee", "https://m.media-amazon.com/images/I/71o2Imt09BL._AC_UF1000,1000_QL80_.jpg"),
        Book(10, "O Hobbit", "J.R.R. Tolkien", "https://m.media-amazon.com/images/I/71h6tR64mYL._AC_UF1000,1000_QL80_.jpg"),
        // Adicione mais livros se quiser
    )
}