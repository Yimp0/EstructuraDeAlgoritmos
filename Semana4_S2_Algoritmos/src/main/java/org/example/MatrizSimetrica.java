package org.example;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,5,9},
                {5,2,4},
                {9,4,3}
        };
        boolean esSimetrico = true;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] != matriz[j][i]){
                    esSimetrico = false;
                }
            }
        }
        System.out.println("¿Es simetrico?: "+esSimetrico);
    }
}
