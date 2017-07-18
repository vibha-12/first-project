package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.SpringBootWeb;

@SpringBootApplication
@RequestMapping("/Book")
public class SpringBootWeb extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWeb.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWeb.class, args);
		System.out.println("abcdefghijklmnopqrstuvwxyz");
	}

}