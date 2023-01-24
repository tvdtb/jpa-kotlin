package com.trivadis.jjpahib.service

import com.trivadis.jjpahib.entity.User
import com.trivadis.jjpahib.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService(val repo: UserRepository) {

    fun readAll(): Iterable<User> = repo.findAll()
    fun find(l: Long): Any {
        return repo.findById(l)
    }

    fun querySmaller(i: Int): List<User> {
        return repo.findSmaller(i);
    }

}
