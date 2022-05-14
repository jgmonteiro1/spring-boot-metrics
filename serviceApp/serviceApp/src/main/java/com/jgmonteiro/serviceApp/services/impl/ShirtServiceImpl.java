package com.jgmonteiro.serviceApp.services.impl;

import com.jgmonteiro.serviceApp.services.ShirtService;
import org.springframework.stereotype.Service;

@Service
public class ShirtServiceImpl implements ShirtService {

    @Override
    public Boolean getShirtAvailability(final String shirt) {
        return verifyAvailability(shirt);
    }

    private boolean verifyAvailability(final String shirt){
        return switch(shirt){
            case "palmeiras" -> true;
            case "vitoria" -> throw new RuntimeException("Camisa do 'liao' indisponivel");
            default -> false;
        };
    }
}
