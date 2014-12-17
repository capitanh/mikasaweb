package net.mikasa.mikasaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(Application.class, args);
	}	

}
