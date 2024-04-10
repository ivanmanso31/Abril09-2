package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Producto {

    public static int CONTADOR = 0;

    private final int ID;
    private String nombre;
    private double precio;

    public Producto() {
        ID = CONTADOR++;
        this.nombre="productito";
        this.precio=99.99;
    }

    public double importe(int cantidad){
        return precio*cantidad;
    }

}
