package com.akondi.reactivespringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class ReactiveSpringBootApplication

fun main(args: Array<String>) {
    runApplication<ReactiveSpringBootApplication>(*args)
}
