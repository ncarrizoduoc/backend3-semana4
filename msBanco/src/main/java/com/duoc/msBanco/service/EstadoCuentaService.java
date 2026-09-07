package com.duoc.msBanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.msBanco.model.EstadoCuenta;
import com.duoc.msBanco.model.MovimientoCuenta;
import com.duoc.msBanco.repository.EstadoCuentaRepository;
import com.duoc.msBanco.repository.MovimientoCuentaRepository;

@Service 
public class EstadoCuentaService {
    @Autowired 
    private MovimientoCuentaRepository movRepo;

    @Autowired
    private EstadoCuentaRepository estadoRepo;

    public EstadoCuenta findById(Long id){
        Optional<EstadoCuenta> encontrado = estadoRepo.findById(id);
        if (encontrado.isEmpty()){
            return null;
        } else {
            EstadoCuenta estado = encontrado.get();
            List<MovimientoCuenta> movimientos = movRepo.findByCuentaId(id);
            estado.setMovimientos(movimientos);
            return estado;
        }
    }

}
