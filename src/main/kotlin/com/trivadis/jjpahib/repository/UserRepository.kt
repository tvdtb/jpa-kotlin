package com.trivadis.jjpahib.repository

import com.trivadis.jjpahib.entity.User
import jakarta.persistence.QueryHint
import org.hibernate.jpa.HibernateHints
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.QueryHints

interface UserRepository : JpaRepository<User,Long>{
    @Query("SELECT u FROM User u WHERE id<=:maxValue")
    @QueryHints(QueryHint(name = HibernateHints.HINT_CACHEABLE, value = "true"))
    abstract fun findSmaller(maxValue: Int): List<User>

}
