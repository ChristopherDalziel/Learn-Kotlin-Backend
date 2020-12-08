package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.stereotype.Component

// A component in Spring is an object which it's lifecycle is managed by Spring. These components can be injected/autowired? into class properties using Springs dependency injection system.
@Component
class BooksDatabase {
    // All of our books will be created here
    private val books = mutableListOf<Book>()
}