package com.spring.sleuth.zipklin.CloudClient.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ClientController {

	private static final Logger log=LoggerFactory.getLogger(ClientController.class);
	
	@GetMapping(value = "/server")
    public String hello() {
		log.info("Reached Server");
        return "Hi! This is Sleuth-Zipkin Server";
    }
	
}
