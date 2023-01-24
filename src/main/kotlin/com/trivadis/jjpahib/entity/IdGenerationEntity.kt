package com.trivadis.jjpahib.entity

import jakarta.persistence.*

@Entity
open class IdGenerationEntity(
    //@Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    //String uuid;

    @Id
    @GeneratedValue
    //@GeneratedValue(strategy = GenerationType.TABLE)
    //@TableGenerator(name = "myGenerator", initialValue = 1000, allocationSize = 1, table = "sequences", pkColumnName = "name", valueColumnName = "value")
	//@GeneratedValue(generator = "myGenerator")
    open var userId: Long?,
    open var name: String?,
)
