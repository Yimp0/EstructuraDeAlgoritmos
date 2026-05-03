package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Columna {
    public static void  main(String[] args) {
        Queue<String> historial = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Ingresar una palabra");
            System.out.println("2. Eliminar ultima palabra");
            System.out.println("3. Mostrar primera palabra");
            System.out.println("4.Salir");
            System.out.println("Seleccionar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Escribe una palabra");
                    String palabra = sc.next();
                    historial.add(palabra);
                    System.out.println("Palabra guardada");
                }
                case 2 -> {
                    if(!historial.isEmpty()){
                        System.out.println("Eliminando: "+historial.poll());
                    }else{
                        System.out.println("El editor esta vacio");
                    }
                }
                case 3 -> {
                    if(!historial.isEmpty()){
                        System.out.println("En el tope esta: "+historial.peek());
                    }else{
                        System.out.println("El editor esta vacio");
                    }
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
    }
}
