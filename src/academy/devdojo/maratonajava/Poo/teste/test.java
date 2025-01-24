package academy.devdojo.maratonajava.Poo.teste;

import academy.devdojo.maratonajava.Poo.dominio.Calculadora;

public class test {
    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumero(4,7.9F);

        Calculadora teste3 = new Calculadora();

        float result = teste3.divideDoisNumeros(9F,0);

        System.out.println(result);

        Calculadora calculadora12 = new Calculadora();

        System.out.println(calculadora12.hashCode());
        System.out.println(calculadora12.hashCode());
        var teste = calculadora12.hashCode();

        System.out.println(teste);


    }
}
