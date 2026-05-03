package org.example;

import java.util.Scanner;
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Ingrese una palabra");
            System.out.println("2. Eliminar una palabra");
            System.out.println("3. Mostrar palabra");
            System.out.println("4.Salir");
            System.out.println("Seleccionar");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> {
                    System.out.println("Escribe una palabra");
                    String palabra = sc.next();
                    historial.push(palabra);
                    System.out.println("Palabra guardada");
                }
                case 2 -> {
                    if(!historial.isEmpty()){
                        System.out.println("Eliminando: "+historial.pop()); //Quitar tope
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
            }
        }while(opcion!=4);


    }
}
