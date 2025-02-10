package academy.devdojo.maratonajava.polimorfismo.service;

import academy.devdojo.maratonajava.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.polimorfismo.domain.Tomate;

public class CalculaImposto {

    public static void calcularImposto(Produto produto){

        System.out.println("Relatório Imposto");

        double imposto = produto.calcularImposto();

        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        System.out.println("--------------------------------");

    }


}
