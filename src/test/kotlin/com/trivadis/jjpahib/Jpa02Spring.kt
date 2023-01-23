package com.trivadis.jjpahib

import com.trivadis.jjpahib.entity.User
import com.trivadis.jjpahib.repository.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
@Commit
class Jpa02Spring {

    @Autowired
    lateinit var repo: UserRepository

    @Test
    fun doSpringRepository() {
        val foundUser = repo.findById(252L).get()

        val user = User(name = "John Repository", email = "john.repository@jpa.org")
        repo.save(user)

        repo.delete(foundUser);
    }

}
