package com.trivadis.jjpahib.entity

import jakarta.persistence.*

@Embeddable
open class EmbeddableAddress(
        open var strasse: String?=null,
        open var ort: String?=null
)
