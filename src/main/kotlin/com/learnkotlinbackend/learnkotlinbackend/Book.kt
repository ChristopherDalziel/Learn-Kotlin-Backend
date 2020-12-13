package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Repository

// A simple Book class that will define each book
@Repository
@Document(collection = "Books")
class Book() {
//    lateinit var id: String
    lateinit var isbn: String
    lateinit var title: String
    lateinit var author: String
    var coverUrl: String? = null

    constructor(
//        id: String,
        isbn: String,
        title: String,
        author: String,
        coverUrl: String? = null) : this() {
//            this.id = id
            this.isbn = isbn
            this.title = title
            this.author = author
            this.coverUrl = coverUrl
    }
}