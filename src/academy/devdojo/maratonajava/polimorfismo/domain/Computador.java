package academy.devdojo.maratonajava.polimorfismo.domain;

public class Computador extends Produto{

    public static final double imposto = 0.20;

    public Computador(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando Imposto...");
        return this.valor * imposto;
    }



}
