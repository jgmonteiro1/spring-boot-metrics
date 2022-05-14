package com.jgmonteiro.clientApp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "serviceApp", url = "http://localhost:8080/available")
@Component
public interface ServiceAppClient {

    @GetMapping("/{shirt}")
    Boolean getAvailabilityShirt(@PathVariable final String shirt);

}
