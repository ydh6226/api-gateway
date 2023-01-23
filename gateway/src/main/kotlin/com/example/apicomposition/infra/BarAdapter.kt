package com.example.apicomposition.infra

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class BarAdapter(
    private val webClient: WebClient,
) {

    fun getBar(): Mono<String> {
        return webClient
            .get()
            .uri("http://localhost:9001/api/v1")
            .exchangeToMono { res -> res.bodyToMono(String::class.java) }
    }
}