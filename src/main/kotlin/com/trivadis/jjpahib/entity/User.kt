package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "users")
open class User(
    @Id @GeneratedValue
    open var id: Long? = null,
    open var name: String?,
    open var email: String?,
    @Temporal(TemporalType.TIMESTAMP)
    open var lastLogin: LocalDateTime? = null,
    @Enumerated(EnumType.ORDINAL)
    open var sex: Sex? = null,
    @Lob @Column(name = "icon", columnDefinition="bytea")
    open var icon: ByteArray?=null
) {
    override fun toString(): String {
        return "User[id="+id+", name="+name+"]";
    }
}
