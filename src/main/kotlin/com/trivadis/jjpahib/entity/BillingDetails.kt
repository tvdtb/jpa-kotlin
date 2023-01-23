package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
open abstract class BillingDetails(
        @Id
        open var id: UUID? = UUID.randomUUID(),
        @Temporal(value = TemporalType.TIMESTAMP)
        open var paymentDueTime: LocalDateTime
)
