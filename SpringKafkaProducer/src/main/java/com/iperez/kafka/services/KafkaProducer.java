package com.iperez.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.iperez.kafka.model.Incident;

@Service
public class KafkaProducer {
	@Autowired
	private KafkaTemplate<String, Incident> kafkaTemplate;
	
	@Value("${jsa.kafka.topic}")
	String kafkaTopic = "jsa-test";
	
	public void send(Incident incident) {
	    System.out.println("sending data=" + incident);
	    kafkaTemplate.send(kafkaTopic, incident);
	}
}
