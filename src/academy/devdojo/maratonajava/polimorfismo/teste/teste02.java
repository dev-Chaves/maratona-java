package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.polimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.polimorfismo.service.CalculaImposto;

public class teste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("RYZEN", 3000L);

        Produto tv = new Televisao("Sony", 4000);

        Tomate tomate = new Tomate("Americano", 12);

//        System.out.println(produto.getNome());
//        System.out.println(produto.getValor());

//        System.out.println(tv.calcularImposto());

        CalculaImposto.calcularImposto(tv);

    }
}
