package com.trivadis.jjpahib.entity

import jakarta.persistence.*
import java.util.*

@Entity
open class LargeData(
        @Id
        open var myid: Long?,
        open var name: String?,
        @Basic(fetch = FetchType.LAZY)
        open var data: ByteArray
) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other === null || other !is LargeData) return false
                return myid == other.myid // let it crash if null
        }

        override fun hashCode(): Int {
                return myid.hashCode(); // let it crash if null
        }

        override fun toString(): String {
                return "LargeData[id=${myid}]"
        }
}
