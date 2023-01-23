package com.trivadis.jjpahib

import com.trivadis.jjpahib.entity.*
import jakarta.persistence.EntityManager
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*

@SpringBootTest
@Transactional
@Commit
class Jpa05Inheritance {

    @Autowired
    lateinit var em: EntityManager;

    @Test
    fun persist() {
        em.persist(BankAccount(UUID.randomUUID(), LocalDateTime.now(), "iban"))
        val credit = UUID.randomUUID()
        val creditCardCreated = CreditCard(credit, LocalDateTime.now(), "creditcard")
        em.persist(creditCardCreated)
        println("persisted")

    }

}
