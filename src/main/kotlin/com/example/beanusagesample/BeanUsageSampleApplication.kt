package com.example.beanusagesample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BeanUsageSampleApplication {
	// Beanがスキャンされる場所に記述していれば認識する
	// @Beanのメソッドはアプリケーションクラスに書けばOK
	@Bean
	fun generateBean(): NormalClassForBean {
		return NormalClassForBean("Good morning!")
	}
}

fun main(args: Array<String>) {
	runApplication<BeanUsageSampleApplication>(*args)
}
