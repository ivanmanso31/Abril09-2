package com.softtek.modelo.ej1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Globo {

    public static int CONTADOR = 0;

    private int ID;

    public Globo() {
        this.ID=++CONTADOR;
    }
}
