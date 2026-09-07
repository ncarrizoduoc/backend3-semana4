package com.duoc.BffBancoCajero.service;

import org.springframework.stereotype.Service;

import com.duoc.BffBancoCajero.client.BancoMicroserviceClient;
import com.duoc.BffBancoCajero.model.EstadoCuenta;

@Service 
public class BancoCajeroService {

    private final BancoMicroserviceClient bancoMicroserviceClient;

    public BancoCajeroService(BancoMicroserviceClient bancoMicroserviceClient) {
        this.bancoMicroserviceClient = bancoMicroserviceClient;
    }

    public EstadoCuenta getEstadoCuenta(Long id){
        EstadoCuenta estadoCuenta = bancoMicroserviceClient.getEstadoCuenta(id);
        if (estadoCuenta == null){
            return null;
        }
        return estadoCuenta;
        
    }

}
