package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Duplicate item.")
class DuplicateItemException: RuntimeException() {
//    @RequestMapping("", method = arrayOf(RequestMethod.POST))
//    fun addBook(@RequestBody book: Book) =
//        if (database.addBook(book)) book
//    else throw DuplicateItemException()
}