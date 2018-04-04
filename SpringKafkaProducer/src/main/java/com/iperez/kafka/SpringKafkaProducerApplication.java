package com.iperez.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iperez.kafka.model.Incident;
import com.iperez.kafka.services.KafkaProducer;

@SpringBootApplication
public class SpringKafkaProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerApplication.class, args);
	}
	
	@Autowired
	KafkaProducer producer;
	
	@Override
	public void run(String... arg0) throws Exception {
		// Send incident customer
		com.iperez.kafka.model.Incident lift = new Incident();
		lift.setNombre("lift");
		producer.send(lift);
		
	}
	
}
