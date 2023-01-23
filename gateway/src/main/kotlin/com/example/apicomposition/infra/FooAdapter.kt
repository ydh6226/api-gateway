package com.example.apicomposition.infra

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class FooAdapter(
    private val webClient: WebClient,
) {

    fun getFoo(): Mono<String> {
        return webClient
            .get()
            .uri("http://localhost:9002/api/v1")
            .exchangeToMono { res -> res.bodyToMono(String::class.java) }
    }
}