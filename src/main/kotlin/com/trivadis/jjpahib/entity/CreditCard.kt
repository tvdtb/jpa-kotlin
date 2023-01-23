package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
open class CreditCard (id: UUID? = UUID.randomUUID(),
                       paymentDueTime: LocalDateTime,
                       open val number: String
): BillingDetails(id, paymentDueTime)
