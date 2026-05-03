package Semana5;

public class Antisimetrica {
    public static void main(String args[]){
        int[][] matriz ={
                {0,2,-3},
                {-2,0,4},
                {3,-4,0}
        };

        boolean esAntisimetrica=true;

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]==0){
                    esAntisimetrica=false;
                    break;
                }
            }
        }
        if(esAntisimetrica){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
