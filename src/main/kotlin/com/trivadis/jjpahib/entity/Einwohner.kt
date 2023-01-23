package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
open class Einwohner(
        @Id
        open var id: UUID? = UUID.randomUUID(),
        open var name: String?,
        @ManyToOne
        open var adresse: Adresse?
)
