package com.trivadis.jjpahib.service

import com.trivadis.jjpahib.entity.User
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService() {

    fun readAll(): Iterable<User> = ArrayList<User>(0)

}
