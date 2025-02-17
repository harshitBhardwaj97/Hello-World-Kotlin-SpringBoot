package com.harshitbhardwaj.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Harshit Bhardwaj
 */
@RestController
class GreetingController {

    @GetMapping("/hello-world")
    fun Greet() = "hello-world-from-kotlin-springboot"

    @GetMapping("/")
    fun RootEndpoint() = "hit /hello-world endpoint"
}