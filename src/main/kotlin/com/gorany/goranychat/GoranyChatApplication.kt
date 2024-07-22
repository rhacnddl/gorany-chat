package com.gorany.goranychat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoranyChatApplication

fun main(args: Array<String>) {
    runApplication<GoranyChatApplication>(*args)
}
