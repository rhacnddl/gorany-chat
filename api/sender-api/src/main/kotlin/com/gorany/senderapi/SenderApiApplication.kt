package com.gorany.senderapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SenderApiApplication

fun main(args: Array<String>) {
    runApplication<SenderApiApplication>(*args)
}
