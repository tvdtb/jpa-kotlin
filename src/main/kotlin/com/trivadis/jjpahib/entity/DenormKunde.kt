package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
open class DenormKunde(
    @Id
    open var id: UUID? = UUID.randomUUID(),
    open var name: String?,
    @Embedded
    @AttributeOverrides(
        value = [AttributeOverride(name = "strasse", column = Column(name = "default_strasse")),
            AttributeOverride(name = "ort", column = Column(name = "default_ort"))]
    )
    open var adresse: EmbeddableAddress? = null,

    @Embedded
    open var myAdresse: EmbeddableAddress? = null,

    @Embedded
    @AttributeOverrides(
        value = [AttributeOverride(name = "strasse", column = Column(name = "liefer_strasse")),
            AttributeOverride(name = "ort", column = Column(name = "liefer_ort"))]
    )
    open var lieferAdresse: EmbeddableAddress? = null,

    )
