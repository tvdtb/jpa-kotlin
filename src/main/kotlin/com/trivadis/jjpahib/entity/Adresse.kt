package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import org.hibernate.annotations.BatchSize
import java.util.UUID

@Entity
open class Adresse(
        @Id
        open var id: UUID? = UUID.randomUUID(),
        open var strasse: String?,
        open var ort: String?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "fk_land_id")
        open var land: Land,
        @OneToMany(mappedBy = "adresse", fetch = FetchType.LAZY)
        //@BatchSize(size = 6)
        open var einwohner: java.util.List<Einwohner>?
)
