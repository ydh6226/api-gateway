package com.example.apicomposition

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FooApp

fun main(args: Array<String>) {
    runApplication<FooApp>(*args)
}
