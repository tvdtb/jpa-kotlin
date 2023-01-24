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

@SpringBootTest(properties = arrayOf(
    "spring.jpa.properties.hibernate.jdbc.batch_size=7"
))
@Transactional
@Commit
class Jpa90IdGenerators {

    @Autowired
    lateinit var em: EntityManager;

    @Test
    fun doIdGeneration() {

        em.persist(IdGenerationEntity(null, "EINS"));
        em.persist(IdGenerationEntity(null, "ZWEI"));
        em.persist(IdGenerationEntity(null, "3"));
        em.persist(IdGenerationEntity(null, "4"));
        em.persist(IdGenerationEntity(null, "5"));
        em.persist(IdGenerationEntity(null, "6"));
        em.persist(IdGenerationEntity(null, "7"));
        em.persist(IdGenerationEntity(null, "8"));
        em.persist(IdGenerationEntity(null, "9"));
        em.persist(IdGenerationEntity(null, "10"));

    }

}
