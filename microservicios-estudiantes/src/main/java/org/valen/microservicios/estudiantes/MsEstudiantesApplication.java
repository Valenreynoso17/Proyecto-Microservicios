package org.valen.microservicios.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsEstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEstudiantesApplication.class, args);
	}

}
