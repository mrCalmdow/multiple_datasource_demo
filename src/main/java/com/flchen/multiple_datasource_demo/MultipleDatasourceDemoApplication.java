package com.flchen.multiple_datasource_demo;

import com.thoughtworks.xstream.XStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.flchen.multiple_datasource_demo.repo.mongo")
@EnableJpaRepositories("com.flchen.multiple_datasource_demo.repo.mysql")
public class MultipleDatasourceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatasourceDemoApplication.class, args);
	}

	@Bean
	public XStream xStream() {
		return new XStream();
	}

}

