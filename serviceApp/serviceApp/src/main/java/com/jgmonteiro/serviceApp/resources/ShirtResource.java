package com.jgmonteiro.serviceApp.resources;

import com.jgmonteiro.serviceApp.services.ShirtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShirtResource {

    private final ShirtService shirtService;

    public ShirtResource(ShirtService shirtService) {
        this.shirtService = shirtService;
    }

    @GetMapping("/available/{shirt}")
    public Boolean getShirtAvailability(@PathVariable String shirt){
            return shirtService.getShirtAvailability(shirt);
    }



}
