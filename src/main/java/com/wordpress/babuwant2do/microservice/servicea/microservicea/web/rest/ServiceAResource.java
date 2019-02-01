package com.wordpress.babuwant2do.microservice.servicea.microservicea.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordpress.babuwant2do.microservice.servicea.microservicea.web.proxy.ServiceBResourceProxy;

@RestController
@RequestMapping("/api/resource-a")
public class ServiceAResource {
	
	private final ServiceBResourceProxy serviceBResourceProxy;
	
	public ServiceAResource(ServiceBResourceProxy serviceBResourceProxy){
		this.serviceBResourceProxy = serviceBResourceProxy;
	}
	
	@RequestMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name){
		String welcomeMSg = this.serviceBResourceProxy.welcome(name);
		return ResponseEntity.ok("Hello "+ name+"\n"+welcomeMSg);
	}
}
