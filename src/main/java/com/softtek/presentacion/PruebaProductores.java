package com.softtek.presentacion;

import com.softtek.modelo.Configuracion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class PruebaProductores {

    public void metodo1(){
        Supplier<Integer> aleatorio = () ->{
            Random random = new Random();
            return random.nextInt(10,20);
        };
        System.out.println(aleatorio.get());
    }

    public void metodo2(){
        Supplier<ArrayList<String>> lista = () ->{
            ArrayList<String> a = new ArrayList<>();
            a.add("Hola");
            a.add("Mundo");
            return a;
        };
        System.out.println(lista.get());
    }

    public void metodo3(){
        Supplier<LocalDateTime> tiempo = LocalDateTime::now;
        System.out.println(tiempo.get());
    }

    public void metodo4(){
        Supplier<String> vacio = () ->"";
        System.out.println(vacio.get());
    }

    public void metodo5(){
    Supplier<Configuracion> config = () -> new Configuracion();
        System.out.println(config.get());
    }
    public static void main(String[] args) {
        PruebaProductores p = new PruebaProductores();
        p.metodo1();
        p.metodo2();
        p.metodo3();
        p.metodo4();
        p.metodo5();
    }
}
