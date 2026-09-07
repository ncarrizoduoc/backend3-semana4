package com.duoc.BffBancoWeb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.BffBancoWeb.model.EstadoCuenta;
import com.duoc.BffBancoWeb.service.BancoWebService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/web/banco")
public class BancoWebController {

    private final BancoWebService bancoMovilService;

    public BancoWebController(BancoWebService bancoMovilService) {
        this.bancoMovilService = bancoMovilService;
    }

    @GetMapping("/estado-cuenta/{id}")
    public ResponseEntity<EstadoCuenta> getEstadoCuenta(@PathVariable Long id) {
        EstadoCuenta estadoCuenta = bancoMovilService.getEstadoCuenta(id);
        if (estadoCuenta == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok((estadoCuenta));
        
    }

}
