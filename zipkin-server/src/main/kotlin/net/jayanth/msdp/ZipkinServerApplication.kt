package net.jayanth.msdp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import zipkin.server.EnableZipkinServer

@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
class ZipkinServerApplication{
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ZipkinServerApplication::class.java, *args)
        }
    }
}


