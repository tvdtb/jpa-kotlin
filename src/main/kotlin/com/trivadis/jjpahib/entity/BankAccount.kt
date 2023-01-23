package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
open class BankAccount (id: UUID? = UUID.randomUUID(),
                        paymentDueTime: LocalDateTime,
                        open val iban: String,
                        open val someAttrib1: String?=null,
                        open val someAttrib2: String?=null,
                        open val someAttrib3: String?=null,
                        open val someAttrib4: String?=null,
                        open val someAttrib5: String?=null,
                        open val someAttrib6: String?=null,
                        open val someAttrib7: String?=null,
): BillingDetails(id, paymentDueTime)
