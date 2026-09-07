package com.duoc.msBanco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.msBanco.model.MovimientoCuenta;

public interface MovimientoCuentaRepository extends JpaRepository<MovimientoCuenta, Long>{
    List<MovimientoCuenta> findByCuentaId(Long cuentaId);
}
