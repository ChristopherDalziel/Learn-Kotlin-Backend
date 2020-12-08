package com.learnkotlinbackend.learnkotlinbackend

// A simple Book class that will define each book
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