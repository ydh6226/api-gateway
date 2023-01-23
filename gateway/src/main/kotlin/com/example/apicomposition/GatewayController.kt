package com.example.apicomposition

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class GatewayController(
    private val gatewayService: GatewayService,
) {

    @GetMapping("/api/v1")
    fun apiV1(): Mono<String> {
        return gatewayService.getFooBar()
    }
}