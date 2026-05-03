package org.example;

import java.util.Scanner;

public class MatrizPresupuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] matrizGastos = new double[4][4];
        double totalGastos =0;
        System.out.println("Registro de Gastos Proyectos(Matriz Triangular)");

        for(int i=0;i<matrizGastos.length;i++){
            for(int j=0;j<matrizGastos[i].length;j++){
                if(j>=i){
                    System.out.println("Ingrese gasto para  presupuesto: "+(i+1)+", Mes pago "+(j+1)+":");
                    matrizGastos[i][j]=sc.nextDouble();
                    totalGastos+=matrizGastos[i][j];
                }else{
                    matrizGastos[i][j]=0;
                }
            }
        }
        System.out.println("\n Matriz Gasto proyectados");
        for (int i=0;i<matrizGastos.length;i++){
            for (int j=0;j<matrizGastos[i].length;j++){
                if (matrizGastos[i][j]==0){
                    System.out.print("\t");
                }else{
                    System.out.print(matrizGastos[i][j] +"\t");
                }
            }
            System.out.println();
        }
        System.out.println("\n Matriz Gasto proyectados"+totalGastos);
    }
}
