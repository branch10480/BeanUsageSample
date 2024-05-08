package com.example.beanusagesample

class NormalClassForBean(
    private val greeting: String
) {
    fun greet(): String {
        return greeting
    }
}