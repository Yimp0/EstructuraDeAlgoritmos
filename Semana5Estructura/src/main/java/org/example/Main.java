package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matriz ={
                {1,22,-45},
                {-22,1,423},
                {45,-423,1}
        };
        boolean esAntisimetrica=true;

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j]==0){
                esAntisimetrica=false;
                break;
                }
            }
            System.out.println();
        }
        if(esAntisimetrica){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }

    }
}