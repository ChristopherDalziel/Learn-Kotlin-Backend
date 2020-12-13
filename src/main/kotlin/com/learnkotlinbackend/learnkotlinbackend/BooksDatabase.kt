package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

// A component in Spring is an object which it's lifecycle is managed by Spring. These components can be injected/autowired? into class properties using Springs dependency injection system.
// All @Component annotated classes are singletons
@Component
class BooksDatabase {
    // All of our books will be created here
    private val books = mutableListOf<Book>()

    // @PostConstruct annotation, it gets executed after the spring bean is initialized. (We can have only one?)
    @PostConstruct
    private fun init() {
        // Provide data to our above database
        books.add(
            Book(
                "0765326353",
                "The Way of Kings",
                "Brandon Sanderson",
                coverUrl = "https://d.gr-assets.com/books/1448127430l/7235533.jpg"
            )
        )

        books.add(
            Book(
                "0345391802",
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams",
                coverUrl = "https://d.gr-assets.com/books/1327656754l/11.jpg"
            )
        )

        books.add(
            Book(
                "076531178X",
                "Mistborn: The Final Empire",
                "Brandon Sanderson",
                coverUrl = "https://d.gr-assets.com/books/1437254833l/68428.jpg"
            )
        )
    }

    fun getBooks() = books

    fun addBook(book: Book) : Boolean {
        // Check if a book with the same ISBN already exists within the database if it does.. do not add it.
        books.firstOrNull() { it.isbn == book.isbn }?.let {
            return false
        }
        books.add(book)
        return true
    }
}