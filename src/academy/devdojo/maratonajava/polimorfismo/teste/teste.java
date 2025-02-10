package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.polimorfismo.service.CalculaImposto;

public class teste {
    public static void main(String[] args) {
        Computador computador1 = new Computador("NUKE", 1000L);

        Tomate tomate1 = new Tomate("Tomate do fortnite", 10L);

        CalculaImposto.calcularImposto(computador1);

        CalculaImposto.calcularImposto(tomate1);


    }
}
