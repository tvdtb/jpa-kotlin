package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "users")
open class User(
    @Id @GeneratedValue
    open var id: Long? = null,
    open var name: String?,
    open var email: String?
) {
    override fun toString(): String {
        return "User[id="+id+", name="+name+"]";
    }
}
