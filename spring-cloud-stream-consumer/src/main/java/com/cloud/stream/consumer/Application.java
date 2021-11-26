package com.cloud.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class Application {

	private Logger logger = LoggerFactory.getLogger(Application.class);

	@StreamListener("input")
	public void consumeMessage(Book book) {
		logger.info("Consume payload : " + book);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
