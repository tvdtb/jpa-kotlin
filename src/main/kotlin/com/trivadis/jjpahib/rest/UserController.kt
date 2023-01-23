package com.trivadis.jjpahib.rest

import com.trivadis.jjpahib.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api/user")
class UserController(val service: UserService) {
    @GetMapping("/")
    fun getAll() = service.readAll()
}