package com.jgmonteiro.clientApp.resources;

import com.jgmonteiro.clientApp.client.ServiceAppClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ServiceAppClient serviceAppClient;

    public ClientController(ServiceAppClient serviceAppClient) {
        this.serviceAppClient = serviceAppClient;
    }

    @GetMapping("/clientsIntegration/{shirt}")
    public Boolean getShirtIntegration(@PathVariable  final String shirt) {
        return serviceAppClient.getAvailabilityShirt(shirt);
    }
}
