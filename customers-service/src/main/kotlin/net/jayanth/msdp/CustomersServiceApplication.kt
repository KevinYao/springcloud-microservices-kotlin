package net.jayanth.msdp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CustomersServiceApplication{

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(CustomersServiceApplication::class.java, *args)
        }
    }
}


