package com.spring.sleuth.zipklin.CloudClient.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class ClientController {

	private static final Logger log=LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/client")
    public String hello() {
		
		log.info("Before Calling the Seluth-Zipkin Server");
	    String response = restTemplate.getForObject("http://localhost:8081/rest/server", String.class);
	    log.info("After Calling the Seluth-Zipkin Server");

	        return response;
    }
	
}
