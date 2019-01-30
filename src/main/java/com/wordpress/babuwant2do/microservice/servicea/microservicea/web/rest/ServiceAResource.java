package com.wordpress.babuwant2do.microservice.servicea.microservicea.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource-a")
public class ServiceAResource {
	
	@RequestMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name){
		return ResponseEntity.ok("Hello "+ name);
	}
}
