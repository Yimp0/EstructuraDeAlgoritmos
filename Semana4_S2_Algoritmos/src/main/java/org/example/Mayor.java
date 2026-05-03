package org.example;

public class Mayor {
    public static void main(String[] args) {
        int[][] tabla ={
                {89,50,60},
                {100,200,300},
                {50,80,90}
        };
        int mayor =tabla[0][0];
        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i].length; j++) {
                if (tabla[i][j] > mayor) {
                    mayor = tabla[i][j];
                }
            }
        }
        System.out.println("El número mauor es: "+mayor);
    }
}
