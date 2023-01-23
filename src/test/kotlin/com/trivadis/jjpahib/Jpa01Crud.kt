package com.trivadis.jjpahib

import com.trivadis.jjpahib.entity.User
import jakarta.persistence.EntityManager
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@SpringBootTest
@Transactional
@Commit
class Jpa01Crud {

    @Autowired
    lateinit var em: EntityManager

    @Test
    fun doCreate() {
        val user = User(name = "John Doe", email = "john.doe@jpa.org")
        em.persist(user)
        println("USER = " + user)
    }

    @Test
    fun doReadDetachUpdate() {
        val foundUser = em.find(User::class.java, 202)
        println("FOUND = " + foundUser)

        // em.detach(foundUser)

        foundUser.name = "now="+LocalDateTime.now()
    }

    @Test
    fun doDelete() {
        val foundUser = em.find(User::class.java, 202)
        println("FOUND = " + foundUser)

        em.remove(foundUser)
    }
}
