package com.softtek.presentacion;

import java.util.function.Predicate;

public class ProbarPredicados {

    private void metodo1(){
        Predicate<Integer> positivo = x -> x >0;
        boolean resultado = positivo.test(4);
        System.out.println(resultado);
    }

    private void metodo2(){
        Predicate<String> vacio = x -> x.isEmpty();
        boolean resultado = vacio.test("");
        System.out.println(resultado);
    }

    private void metodo3(){
        Predicate<Integer> par = x-> x%2==0;
        boolean resultado = par.test(3);
        System.out.println(resultado);
    }

    private void metodo4(){
        Predicate<Integer> mayor = x-> x>15;
        boolean resultado = mayor.test(17);
        System.out.println(resultado);
    }

    private void metodo5(){
        Predicate<Integer> mayor1 = x-> x>1;
        Predicate<Integer> resto = x-> {
            for (int i = 2; i < Math.sqrt(x) ; i++) {
               if( x%i!=0){
                   return true;
               }
            };
            return false;
        };
        boolean resultado = mayor1.and(resto).test(8);
        System.out.println(resultado);
    }


    public static void main(String[] args) {
        ProbarPredicados p = new ProbarPredicados();
        p.metodo1();
        p.metodo2();
        p.metodo3();
        p.metodo4();
        p.metodo5();
    }
}
