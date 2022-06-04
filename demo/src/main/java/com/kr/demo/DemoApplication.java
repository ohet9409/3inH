package com.kr.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		log.info("테스트000");
		System.out.println("aaaa");
		SpringApplication.run(DemoApplication.class, args);
	}
		
}
