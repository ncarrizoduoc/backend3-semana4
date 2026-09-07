package com.duoc.msBanco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.msBanco.model.EstadoCuenta;
import com.duoc.msBanco.service.EstadoCuentaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/banco")
public class EstadoCuentaController {

    @Autowired 
    private EstadoCuentaService estadoService;

    @GetMapping("/estado-cuenta/{id}")
    public EstadoCuenta findById(@PathVariable Long id) {
        return estadoService.findById(id);
    }

}
