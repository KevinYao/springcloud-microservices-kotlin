package net.jayanth


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class MsdpCloudConfigServerApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(MsdpCloudConfigServerApplication::class.java, *args)
        }
    }
}


