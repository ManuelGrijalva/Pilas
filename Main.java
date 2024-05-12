package edu.ejercicios;

import Pilas.PilaLIneal;

import java.util.Scanner;

public class Main {

    public static void palindromo(){
        PilaLIneal pila = new PilaLIneal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra para verificar si es palíndromo:");
        String palabra = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");

        String palabraInvertida = "";

        //creamos la pila con la palabra
        for (int i = 0; i < palabra.length(); i++) {
            try {
                pila.insertar(palabra.charAt(i));
            } catch (Exception ex) {
                System.out.println("problema al insertar" + ex.getMessage());
            }
        }

        //se comprueba si es palíndromo
        while (!pila.pilaVacia()) {
            try {
                palabraInvertida += pila.quitar();
            } catch (Exception ex) {
                System.out.println("error comprobando!" );
            }
        }

        if (palabraInvertida.equals(palabra)) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            palindromo();
        }
    }
}

//tarea: hacer que aunque la palabra lo escribamos con mayusculas o minusculas lo reconozca como palindromo o que tenga espacios
//o signos de puntuacion y lo reconozca como palindromo y todas las variaciones que podrian haber y que lo pida en pantalla.