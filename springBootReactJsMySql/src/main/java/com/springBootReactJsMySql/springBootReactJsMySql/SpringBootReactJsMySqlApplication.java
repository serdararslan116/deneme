package com.springBootReactJsMySql.springBootReactJsMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class SpringBootReactJsMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactJsMySqlApplication.class, args);
	}

}
  