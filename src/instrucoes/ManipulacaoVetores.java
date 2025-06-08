package instrucoes;

public class ManipulacaoVetores {
    public static void main (String[] args){
        int [] numeros = {1, 2, 3, 4, 5}; //indices: [0][1][2][3][4]

        int comprimento = numeros.length; // Obtém o comprimento do vetor
        System.out.println("O comprimento do vetor é: " + comprimento);

        System.out.println("\nMostra cada elemento: implementação por extenso");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("\nMostrar cada elemento: implementação simplificada");
        for (int numero : numeros){
            System.out.println(numero);
        }

    }

    public static class EstruturasCondicionais {
        public static void main (String[] args){
            int numero = 0;

            //1. Estrutura if
            if (numero > 0) {
                System.out.println("O número é positivo.");
            }

            //2. Estrutura if-esle
            if (numero % 2 == 0){
                System.out.println("O número é par.");
            } else {
                System.out.println("O númeor é impar.");
            }

            //3. Estrutura if-else if-else
            if (numero > 0) {
                System.out.println ("O número é positivo.");
            } else if (numero < 0) {
                System.out.println ("O númeor é negativo.");
            } else {
                System.out.println("O númeoro é Zero.");
            }

        }

    }
}
