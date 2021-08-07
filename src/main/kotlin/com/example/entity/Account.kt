package com.example.entity

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.util.*


@MappedEntity
@Introspected
data class Account(
    val username: String = "",
    val password: String = "",
    val email: String = "",
    @Relation(Relation.Kind.MANY_TO_MANY)
    val role: Set<Role>,
    @DateCreated
    val createdAt: Date?,
    @DateUpdated
    val updatedAt: Date?
) {
    @GeneratedValue
    @Id
    @AutoPopulated
    var id: UUID? = null
}