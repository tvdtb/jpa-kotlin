package com.trivadis.jjpahib.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
open class User(
    // TODO
) {
    override fun toString(): String {
        return "User[id="+id+", name="+name+"]";
    }
}
