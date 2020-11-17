package com.zy.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * @author :zy
 * @创建日期: 2020年10月29日 下午9:03:26
 */
@SpringBootApplication
@EnableAdminServer
@Configuration
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
