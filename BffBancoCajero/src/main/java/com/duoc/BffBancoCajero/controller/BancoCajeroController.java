package com.duoc.BffBancoCajero.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.BffBancoCajero.model.EstadoCuenta;
import com.duoc.BffBancoCajero.model.EstadoCuentaResponse;
import com.duoc.BffBancoCajero.service.BancoCajeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/cajero/banco")
public class BancoCajeroController {

    private final BancoCajeroService bancoMovilService;

    public BancoCajeroController(BancoCajeroService bancoMovilService) {
        this.bancoMovilService = bancoMovilService;
    }

    @GetMapping("/estado-cuenta/{id}")
    public ResponseEntity<EstadoCuentaResponse> getEstadoCuenta(@PathVariable Long id) {
        EstadoCuenta estadoCuenta = bancoMovilService.getEstadoCuenta(id);
        if (estadoCuenta == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new EstadoCuentaResponse(estadoCuenta));
        
    }

}
