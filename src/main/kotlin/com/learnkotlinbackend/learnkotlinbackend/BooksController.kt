package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class BooksController {
    // Create our 'books' database
    // @Autowired means our database will point to a single instance of our BooksDatabase class. As in we will only need just two methods to access our data.
    @Autowired
    private lateinit var database: BooksDatabase

    // Access method #1
    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun books() = database.getBooks()
}