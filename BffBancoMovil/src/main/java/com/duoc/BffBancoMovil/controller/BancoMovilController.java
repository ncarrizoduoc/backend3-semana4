package com.duoc.BffBancoMovil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.BffBancoMovil.model.EstadoCuenta;
import com.duoc.BffBancoMovil.model.EstadoCuentaResponse;
import com.duoc.BffBancoMovil.service.BancoMovilService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/movil/banco")
public class BancoMovilController {

    private final BancoMovilService bancoMovilService;

    public BancoMovilController(BancoMovilService bancoMovilService) {
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
