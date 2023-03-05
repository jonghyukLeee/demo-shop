package com.shop.user.consumer.repository

import com.shop.user.consumer.entity.Consumer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ConsumerRepository : JpaRepository<Consumer, Long>{
}