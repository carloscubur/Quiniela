package com.byte.quiniela

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

//import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.byte")

class QuinielaApplication

fun main(args: Array<String>) {
    SpringApplication.run(QuinielaApplication::class.java, *args)
    //runApplication<QuinielaApplication>(*args)
}
