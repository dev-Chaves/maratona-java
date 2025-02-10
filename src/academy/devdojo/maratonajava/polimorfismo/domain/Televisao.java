package academy.devdojo.maratonajava.polimorfismo.domain;

public class Televisao extends Produto {
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    private double imposto = 0.30;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto");
        return this.valor * imposto;
    }
}
