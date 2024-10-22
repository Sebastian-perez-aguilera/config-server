package com.example.hotel_service_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HotelServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceCenterApplication.class, args);
	}

}
