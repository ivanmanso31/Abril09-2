package com.softtek.modelo.ej2;

public class Calculadora {

    public static double sumar(double op1, double op2){
        return op1+op2;
    }

    public static double restar(double op1, double op2){
        return op1-op2;
    }

    public static double multiplicar(double op1, double op2){
        return op1*op2;
    }

    public static double dividir(double op1, double op2) throws ArithmeticException{
        if (op2 == 0) {
            throw new ArithmeticException("Division entre 0");
        }
        return op1 / op2;
    }

}
