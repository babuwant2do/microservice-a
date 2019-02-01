package com.wordpress.babuwant2do.microservice.servicea.microservicea.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="micro-service-B")
@RequestMapping("/api/resource-b")
@Service
public interface ServiceBResourceProxy {
	@RequestMapping("/welcome/{name}")
	public String welcome(@PathVariable String name);
}
