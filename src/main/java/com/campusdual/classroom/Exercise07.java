package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(40);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(10);
    }


    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> numeros = new ArrayList<>();
        String mensaje = "El elemento " + num + " no se encuentra en la lista.";
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
            if (numeros.get(i - 1) == num) {
                mensaje = "El elemento " + num + " se encuentra en la posición: " + numeros.indexOf(i);
            }
        }
        System.out.println(mensaje);

    }

    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i;
        }
        System.out.println(suma);
    }

    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

}
