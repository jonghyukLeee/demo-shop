package com.shop.user.seller.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Seller(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sellerId: Long,
    val loginId: String,
    var email: String
)