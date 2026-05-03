package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] sedeNorte = {10,20,30,40};
        int [] sedeSur = {50,40,70};
        int [] sedeEspejo = {10,20,30,40};

        System.out.println("---Inicio de comparacion---");
        //Operacion 1: Comparación de contenido
        boolean sonIdenticas = Arrays.equals(sedeNorte, sedeEspejo);

        System.out.println("1. Comparacion: ¿Sede Norte y Sede Espejo son iguales? \n"+((sonIdenticas ? "si":"no")));
        //Operacion 2: Clonacion superficial
        int [] backupNorte = sedeNorte.clone();
        System.out.println("2. Clonacion: Backup Sede Norte creado con exito");

        //Verificacion de independencia
        sedeNorte[0]=99;
        System.out.println("Original modificado \n" + sedeNorte[0]);
        System.out.println("Backup permanente intacto \n" + backupNorte[0]);

        //Operacion 3: Fusion simple
        int [] redGlobal = fusionarSede(backupNorte,sedeSur);
        System.out.println("3.Red Global consolidada");
        System.out.println("Contenido Final \n" + Arrays.toString(redGlobal));
    }

    public static int[] fusionarSede(int[] arr1, int[] arr2){
        int[] resultado = new int[arr1.length + arr2.length];
        //Copiamos el primer arreglo desde posicion 0
        System.arraycopy(arr1, 0, resultado, 0, arr1.length);
        //Copiamos el segundo arreglo empezando donde termina el otro arreglo
        System.arraycopy(arr2, 0, resultado, arr1.length, arr2.length);
        return resultado;
    }
}