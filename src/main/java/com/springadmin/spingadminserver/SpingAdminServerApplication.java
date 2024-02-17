package com.springadmin.spingadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpingAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingAdminServerApplication.class, args);
	}

}
