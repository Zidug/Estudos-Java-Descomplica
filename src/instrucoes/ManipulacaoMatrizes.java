package instrucoes;

import java.awt.*;

public class ManipulacaoMatrizes {
    public static void main (String[] args){
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Mostrat MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //Quebra de linha após cada linha de matriz
        }

        System.out.println("\nValor da segunda linha e terceira coluna = " + matriz[1][2]);
        //Imprime o valor d aprimeira linha e segunda coluna (2)

        matriz[1][2] = 10; //Modifica o valor da segunda linha e terceira coluna para 10
        System.out.println("\nNovo valor = " + matriz[1][2]); //imprime o novo valor (10)

        System.out.println("\nMostrar MATRIZ atualizada");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
