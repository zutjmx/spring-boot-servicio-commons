package com.zutjmx.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zutjmx@gmail.com: Se comenta el método main por tratarse de un proyecto de librería.
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class SpringBootServicioCommonsApplication {

	
	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(SpringBootServicioCommonsApplication.class, args); }
	 */

}
