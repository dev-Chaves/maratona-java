package academy.devdojo.maratonajava.Poo.teste;

import academy.devdojo.maratonajava.Poo.dominio.Calculadora;

public class CalculadoraTeste1 {
    public static void main(String[] args){

        Calculadora altera = new Calculadora();

        int n1 = 5;
        int n2 = 10;

        altera.alterarNumeros(n1, n2);

        System.out.println(n1);
        System.out.println(n2);

        // Por que isso acontence ?
        // variaveis primitivos = sempre será uma variável enviada, no caso, quando você envia o valor de n1 , você passa uma cópia e tem espaços em memórias diferentes, variavel original nunca sera alterada, no caso, valor primitivo.

    }
}
