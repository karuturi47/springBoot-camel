/**
 * 
 */
package com.veera.boot.camel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Veera
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.veera.boot.camel.route")
public class ApplicationConfiguration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);

	}

}
