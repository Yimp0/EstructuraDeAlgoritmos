package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        for(int i=0;i < matriz.length;i++){
            System.out.print("|");
            for(int j=0;j < matriz[i].length;j++){
                if(Math.abs(i-j) <= 1){
                    matriz[i][j]=1;
                }
                System.out.print(matriz[i][j]);
                if(j!=matriz[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }
}