package com.softtek.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Configuracion {

    private String ruta = "/ruta/archivo";
    private String conexion = "localhost:3306";

}
