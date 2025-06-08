package funcoes;

import java.util.function.Consumer;

public class Lambda {
    public static void main (String[] args){
        //Exemplo de funcção lambda que  implemeta e a interface funcional Consumer
        Consumer<String> imprimirMensagem = mensagem -> System.out.println(mensagem);

        //Usando a funcção para imprimir uma mensagem
        imprimirMensagem.accept("Olá, mundo! Este é um exemplo de função lambda.");
    }
}
