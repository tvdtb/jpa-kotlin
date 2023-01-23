package com.trivadis.jjpahib

import com.trivadis.jjpahib.entity.Sex
import com.trivadis.jjpahib.entity.User
import com.trivadis.jjpahib.repository.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.test.context.ActiveProfiles
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@SpringBootTest
@Transactional
@Commit
class Jpa03DataTypes {

    @Autowired
    lateinit var repo: UserRepository

    @Test
    fun doDataTypes() {
        val user = User(name = "John Repository", email = "john.repository@jpa.org")
        user.lastLogin = LocalDateTime.now()
        user.sex = Sex.MALE
        user.icon = byteArrayOf(0xCA.toByte(), 0xFE.toByte(), 0xBA.toByte(), 0xBE.toByte())
        repo.save(user)
    }

    @Test
    fun doReadDataTypes() {
        val user = repo.findById(452L).get()
        println(user)
    }
}
