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
class Jpa04OneToMany {

    @Autowired
    lateinit var em: EntityManager;

    @Test
    fun persistLaender() {
        val de = Land(UUID.randomUUID(),"Deutschland")
        em.persist(de);
        val ch = Land(UUID.randomUUID(),"Schweiz")
        em.persist(ch);
        val oe = Land(UUID.randomUUID(), "Oesterreich")
        em.persist(oe);
        val fr = Land(UUID.randomUUID(), "Frankreich")
        em.persist(fr);

        val dortmund = Adresse(UUID.randomUUID(), "Phönixseestr", "Dortmund", de, null)
        em.persist(dortmund)
        val st = Adresse(UUID.randomUUID(), "Industriestraße", "Stuttgart", de, null)
        em.persist(st)
        val st2 = Adresse(UUID.randomUUID(), "Forststraße", "Stuttgart", de, null)
        em.persist(st2)
        em.persist(Adresse(UUID.randomUUID(), "Irgendwo", "Zürich", ch, null))
        em.persist(Adresse(UUID.randomUUID(), "Irgendwo", "Österreich", oe, null))
        em.persist(Adresse(UUID.randomUUID(), "Irgendwo", "Frankreich", fr, null))

        em.persist(Einwohner(UUID.randomUUID(), "grandcentrix", dortmund))
        val tvd = Einwohner(UUID.randomUUID(), "trivadis", st)
        em.persist(tvd)
        em.persist(Einwohner(UUID.randomUUID(), "Accenture", st))

        println("stuttgart = "+st.id)
    }

    @Test
    fun sucheSandwich() {

        val stuggi = em.find(Adresse::class.java, UUID.fromString("add73642-dbcf-43e5-80ec-9bc8ce5cb623"))
        println(stuggi)
    }

}
