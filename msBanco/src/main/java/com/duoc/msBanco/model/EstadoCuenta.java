package com.duoc.msBanco.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "estado_cuenta")
@Data
public class EstadoCuenta {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cuentaId;

    @Column(name = "ingresos", nullable = false)
    private Integer ingresos;

    @Column(name = "salidas", nullable = false)
    private Integer salidas;

    @Column(name = "diferencia", nullable = false)
    private Integer diferencia;

    @Transient 
    private List<MovimientoCuenta> movimientos;
}
