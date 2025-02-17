package com.harshitbhardwaj

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldKotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldKotlinSpringBootApplication>(*args)
}
