package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
open class Land(
        @Id
        open var id: UUID? = UUID.randomUUID(),
        open var name: String?,
        @OneToMany(mappedBy = "land")
        //@JoinColumn(name = "fk_land2_id")
        open var adressen: java.util.Collection<Adresse>? =null,

        @OneToMany(mappedBy = "land")
        @MapKey(name="ort")
        @Column(updatable = false, insertable = false)
        open var stadt2Adresse: java.util.Map<String,Adresse>? = null

)  {
        override fun equals(other: Any?): Boolean {
                println("LAND.equals")
                return super.equals(other)
        }

}

