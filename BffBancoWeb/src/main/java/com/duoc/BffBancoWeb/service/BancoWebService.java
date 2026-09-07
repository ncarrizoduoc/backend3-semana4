package com.duoc.BffBancoWeb.service;

import org.springframework.stereotype.Service;

import com.duoc.BffBancoWeb.client.BancoMicroserviceClient;
import com.duoc.BffBancoWeb.model.EstadoCuenta;

@Service 
public class BancoWebService {

    private final BancoMicroserviceClient bancoMicroserviceClient;

    public BancoWebService(BancoMicroserviceClient bancoMicroserviceClient) {
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
