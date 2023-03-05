package com.shop.user.consumer.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Consumer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val consumerId: Long,
    val loginId: String,
    var email: String
    )