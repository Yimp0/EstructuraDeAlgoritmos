package org.example;

public class Suma {
    public static void main(String[] args) {
        int[][] numeros ={
                {10,20,30},
                {50,60,70}
        };
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                suma+=numeros[i][j];
            }
        }
        System.out.println("La suma total es: " + suma);
    }
}
