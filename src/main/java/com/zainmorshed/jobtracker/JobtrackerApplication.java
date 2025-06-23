package com.zainmorshed.jobtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zainmorshed.jobtracker"})
public class JobtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobtrackerApplication.class, args);
	}

}
