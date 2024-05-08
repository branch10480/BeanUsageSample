package com.example.beanusagesample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    val classBean: ClassBeanSample,
    val generatedBean: NormalClassForBean
) {
    @GetMapping("/")
    fun hello(): String {
        return this.classBean.greet()
    }

    @GetMapping("/morning")
    fun morning(): String {
        return this.generatedBean.greet()
    }
}
