package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearnKotlinBackendApplication

fun main(args: Array<String>) {
	runApplication<LearnKotlinBackendApplication>(*args)
	println("hello world")
}
