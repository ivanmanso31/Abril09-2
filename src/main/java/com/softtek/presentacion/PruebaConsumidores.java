package com.softtek.presentacion;

import com.softtek.modelo.Producto;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class PruebaConsumidores {

    private void metodo1(){
        Consumer<String> consumidor = x-> System.out.println(x.toUpperCase());
        consumidor.accept("hola mundo");
    }

    private void metodo2(){
        Consumer<Integer> consumidor = x-> System.out.println(x+" "+Math.pow(x,2));
        consumidor.accept(4);
    }

    private void metodo3(){
        Consumer<Producto> consumidor = x-> System.out.println(x);
        consumidor.accept(new Producto());
    }

    private void metodo4(){
        Consumer<String> consumidor = x-> JOptionPane.showMessageDialog(null,x);
        consumidor.accept("Mensaje en cuadro de dialogo");
    }

    private void metodo5(){
        Consumer<String> consumidor = x-> {
            try {
                FileWriter fw = new FileWriter("consumidor5.txt");
                fw.write(x);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        };
        consumidor.accept("Mensaje en txt");
    }



    public static void main(String[] args) {
        PruebaConsumidores p = new PruebaConsumidores();
        p.metodo1();
        p.metodo2();
        p.metodo3();
        p.metodo4();
        p.metodo5();
    }
}
