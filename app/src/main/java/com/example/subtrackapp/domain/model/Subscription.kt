package com.example.subtrackapp.domain.model

import java.time.LocalDate

data class Subscription(
    val id: Long,
    val name: String,
    val priceInCents: Int,
    val currency: String,
    val billingCycle: BillingCycle,
    val category: SubscriptionCategory,
    val status: SubscriptionStatus,
    val nextPaymentDate: LocalDate,
)
