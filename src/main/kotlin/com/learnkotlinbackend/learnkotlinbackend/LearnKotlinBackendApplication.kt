package com.learnkotlinbackend.learnkotlinbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class LearnKotlinBackendApplication {}

// Basic controller
// @RestController
// class HelloSpringBootController {
	// RequestMapping annotation registers that this method as a request handler and maps it to the "/" url.
	// @RequestMapping(value = ["/"])
	// Our class method will print "Hello SpringBoot" to the sreen.
	// fun helloSpringBoot() = "Hello SpringBoot"
// }

fun main(args: Array<String>) {
	runApplication<LearnKotlinBackendApplication>(*args)
//	println("hello world")
}
