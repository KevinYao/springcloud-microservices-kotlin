package net.jayanth.msdp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ShipperServiceApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ShipperServiceApplication::class.java, *args)
        }
    }
}