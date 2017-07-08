package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableEurekaClient
class ProductsServiceApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ProductsServiceApplication::class.java, *args)
        }
    }
}


