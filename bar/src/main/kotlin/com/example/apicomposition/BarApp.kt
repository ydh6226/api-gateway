package com.example.apicomposition

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BarApp

fun main(args: Array<String>) {
    runApplication<BarApp>(*args)
}
