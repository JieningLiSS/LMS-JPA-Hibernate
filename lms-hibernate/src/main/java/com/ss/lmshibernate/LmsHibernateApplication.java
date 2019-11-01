package com.ss.lmshibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsHibernateApplication.class, args);
		System.out.println("Admin service in online!");
	}
}
