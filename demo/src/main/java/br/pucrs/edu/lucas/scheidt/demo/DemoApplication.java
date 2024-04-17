package br.pucrs.edu.lucas.scheidt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = { "br.pucrs.edu.lucas.scheidt.demo" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
