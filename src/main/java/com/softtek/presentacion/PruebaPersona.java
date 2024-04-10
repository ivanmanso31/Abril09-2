package com.softtek.presentacion;

import com.softtek.modelo.ej3.EstadoCivil;
import com.softtek.modelo.ej3.Persona;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe",22, EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Juan",23, EstadoCivil.CASADO);
        Persona p3 = new Persona("Jaime",24, EstadoCivil.DIVORCIADO);
        Persona p4 = new Persona("Diego",25, EstadoCivil.VIUDO);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
