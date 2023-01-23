package com.example.apicomposition

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BarController {

    @GetMapping("/api/v1")
    fun apiV1(): String {
        Thread.sleep(5000)
        println("bar!")
        return "bar"
    }
}