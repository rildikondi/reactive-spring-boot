package com.akondi.reactivespringboot

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.util.concurrent.ThreadLocalRandom

@RestController
class RestController(val priceService: PriceService) {

    @GetMapping(
			value = ["/stocks/{symbol}"],
			produces = [MediaType.TEXT_EVENT_STREAM_VALUE]
	)
    fun prices(@PathVariable symbol: String): Flux<StockPrice> = priceService.generatePrices(symbol)
}