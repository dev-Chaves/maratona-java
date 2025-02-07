package academy.devdojo.maratonajava.polimorfismo.domain;

public class Tomate extends Produto{

    public static final double imposto = 0.10;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * imposto;
    }
}
