package com.org.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ElkStackExampleApplication
{

	Logger logger = LoggerFactory.getLogger(ElkStackExampleApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(ElkStackExampleApplication.class, args);
	}

}
