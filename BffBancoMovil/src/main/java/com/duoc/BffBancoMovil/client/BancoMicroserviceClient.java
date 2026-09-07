package com.duoc.BffBancoMovil.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.duoc.BffBancoMovil.model.EstadoCuenta;

@Component
public class BancoMicroserviceClient {
    private final RestClient restClient;

    public BancoMicroserviceClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public EstadoCuenta getEstadoCuenta(Long id){
        return restClient.get()
            .uri("/api/banco/estado-cuenta/{id}", id)
            .retrieve()
            .body(EstadoCuenta.class);
    }

}
