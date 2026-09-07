package com.duoc.BffBancoMovil.model;

import java.util.List;

import lombok.Data;

@Data
public class EstadoCuenta {
    private Long cuentaId;
    private Integer ingresos;
    private Integer salidas;
    private Integer diferencia;
    private List<MovimientoCuenta> movimientos;
}
