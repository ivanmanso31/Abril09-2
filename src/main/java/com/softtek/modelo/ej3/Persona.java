package com.softtek.modelo.ej3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona {

    private String nombre;
    private int edad;
    private EstadoCivil estado;

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Edad: "+edad+" Estado Civil: "+estado;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }else{
            return true;
        }
    }
}
