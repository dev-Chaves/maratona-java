package academy.devdojo.maratonajava.polimorfismo.service;

import academy.devdojo.maratonajava.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.polimorfismo.domain.Tomate;

public class CalculaImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de Imposto PC");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor "+ computador.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
        System.out.println();
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de Imposto Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador " + tomate.getNome());
        System.out.println("Valor "+ tomate.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
        System.out.println();
    }

}
