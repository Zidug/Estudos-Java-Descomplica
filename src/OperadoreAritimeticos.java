public class OperadoreAritimeticos {
    public static void main(String [] args) {

        int x = 15;
        int y = 5;

        int soma = x + y; //Adicção
        System.out.println ("Soma:" + soma);

        int subtracao = x - y; //Subtrção
        System.out.println("Subtrção: " + subtracao);

        int multiplicacao = x * y; //Multiplicação
        System.out.println ("Multiplicação: " + multiplicacao);

        int divisao = x / y; //Divisão
        System.out.println ("Divisão: " + divisao);

        int modulo = x % y; //Modulo (sobra da divisão)
        System.out.println("Modulo: " + modulo);

        //Operadores de Incremento e Decremento
        int incremento = 10;
        int decremento = 10;

        incremento++; //Incremento (incrementa em 1)
        System.out.println("Valor após o incremento: " + incremento);

        decremento--; //Decremento (decrementa em 1)
        System.out.println("Valor após o decremento: " + decremento);

    }
}
