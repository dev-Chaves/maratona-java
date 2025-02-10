package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.polimorfismo.domain.Produto;

public class teste01 {
    public static void main(String[] args) {
        Produto produto = new Computador("RYZEN", 3000L);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

    }
}
