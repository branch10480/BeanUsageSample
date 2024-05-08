package com.example.beanusagesample

import org.springframework.stereotype.Component

@Component
class ClassBeanSample {
    fun greet(): String {
        return "Hello, World! from ClassBeanSample"
    }
}
