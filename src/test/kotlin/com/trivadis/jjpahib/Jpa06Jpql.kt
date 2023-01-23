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
class Jpa06Jpql {

    @Autowired
    lateinit var em: EntityManager;

    @Test
    fun queries() {
        //val found = em.find(BillingDetails::class.java, credit)
        val jpql = em.createQuery("SELECT e FROM BillingDetails e where e.id=:id")
        jpql.setParameter("id", UUID.fromString("TODO"))
        val found = jpql.singleResult
        println("found="+found)

        em.createQuery("SELECT e FROM BillingDetails e").resultList

    }

}
