package com.trivadis.jjpahib

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class JjpahibApplication

fun main(args: Array<String>) {
	runApplication<JjpahibApplication>(*args)
}
