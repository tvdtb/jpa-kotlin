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
class Jpa91LazyLoading {

    @Autowired
    lateinit var em: EntityManager;

    @Test
    fun doLazyLoading() {
        em.persist(LargeData(1L, "Java", byteArrayOf(0xCA.toByte(), 0xFE.toByte(), 0xBA.toByte(), 0xBE.toByte())))
        em.persist(LargeData(2L, "Zeroes", byteArrayOf(0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte())))
        em.flush()
        em.clear()

        val data = em.find(LargeData::class.java, 1L)
        println("Found object " + data);
        data.data
        println("data="+data::class.java)

        val reference = em.getReference(LargeData::class.java, 2L)
        println("ref="+reference::class.java)
    }

}
