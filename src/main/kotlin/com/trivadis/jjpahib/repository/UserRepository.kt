package com.trivadis.jjpahib.repository

import com.trivadis.jjpahib.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User,Long>{

}
