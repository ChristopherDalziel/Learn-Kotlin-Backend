package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Repository

// A simple Book class that will define each book
@Repository
@Document(collection = "Books")
class Book() {
    lateinit var ISBN: String
    lateinit var title: String
    lateinit var author: String
    var coverUrl: String? = null

    constructor(
        ISBN: String,
        title: String,
        author: String,
        coverUrl: String? = null) : this() {
            this.ISBN = ISBN
            this.title = title
            this.author = author
            this.coverUrl = coverUrl
    }
}