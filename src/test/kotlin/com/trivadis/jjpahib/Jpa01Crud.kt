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
        TODO
    }

    @Test
    fun doReadDetachUpdate() {
        TODO
    }

    @Test
    fun doDelete() {
        TODO
    }
}
