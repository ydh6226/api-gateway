package com.example.apicomposition

import com.example.apicomposition.infra.BarAdapter
import com.example.apicomposition.infra.FooAdapter
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class GatewayService(
    private val fooAdapter: FooAdapter,
    private val barAdapter: BarAdapter,
) {

    fun getFooBar(): Mono<String> {
        val foo = fooAdapter.getFoo()
        val bar = barAdapter.getBar()

        return Mono.zip(foo, bar)
            .map { tuple -> tuple.t1 + tuple.t2 }
    }
}