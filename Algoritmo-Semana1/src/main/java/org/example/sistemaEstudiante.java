package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class sistemaEstudiante {
    public static void main(String[] args) {
        //1.Lista estatica
        String [] estudianteEstaticos =  {"Ana","Juan","Luisito","Mayonesa","Pepito"};
        System.out.println("----------Lista de estudiantes---------" );
        for(int i=0;i<estudianteEstaticos.length;i++){
            System.out.println(estudianteEstaticos[i]);
        }
        ArrayList<String> estudianteDinamicos = new ArrayList<>();
        ArrayList<Integer> estudianteEdad = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Ingreso de estudiantes-------");
        for(int i=0;i<5;i++){
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            estudianteDinamicos.add(nombre);
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            estudianteEdad.add(edad);
        }
        sc.close();
        int contador =0;
        int num=1;
        System.out.println("-------Lista Dinamica-------");
        for(String nombre:estudianteDinamicos){
            System.out.println(num +". "+nombre+","+ estudianteEdad.get(contador));
            contador++;
            num++;
        }

        //3.Estructura no lineal

        System.out.println("---------Organizacion de GRUPOS---------");
        System.out.println("-----Grupo A-----");
        for(int i=0;i<estudianteDinamicos.size();i++){
            if (i%2==0){
                System.out.println(estudianteDinamicos.get(i));
            }
        }
        System.out.println("-----Grupo B-----");
        for(int i=0;i<estudianteDinamicos.size();i++){
            if (i%2!=0){
                System.out.println(estudianteDinamicos.get(i));
            }
        }

        System.out.println("-----Grupo C-----");
        for(int i=0;i<estudianteEdad.size();i++){
            if (estudianteEdad.get(i)%2==0){
                System.out.println("Nombre: " +estudianteDinamicos.get(i)+", edad: "+estudianteEdad.get(i));
            }
        }

        System.out.println("-----Grupo D-----");
        for(int i=0;i<estudianteEdad.size();i++){
            if (estudianteEdad.get(i)%2!=0){
                System.out.println("Nombre: "+estudianteDinamicos.get(i)+", edad: "+estudianteEdad.get(i));
            }
        }
    }
}
