package com.example.entity

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*

@MappedEntity
@Introspected
data class Role(val name: String){
    @GeneratedValue
    @Id
    val id: UUID?=null
}
