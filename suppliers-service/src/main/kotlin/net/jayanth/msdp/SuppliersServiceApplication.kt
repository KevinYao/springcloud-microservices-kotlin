package net.jayanth.msdp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SuppliersServiceApplication {

   companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(SuppliersServiceApplication::class.java, *args)
        }
    }
}


