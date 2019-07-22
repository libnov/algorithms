package com.xmashu.algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class AlgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);
	}

}
