package academy.devdojo.maratonajava.ModificadorStatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        if (velocidadeMaxima < 0 || velocidadeLimite < 0) {
            System.out.println("Velocidade Inválida");
            return;
        }

        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidade() {
        return Carro.velocidadeLimite;
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.print("Velocidade Máxima:  " + this.velocidadeMaxima);
        System.out.println();
        System.out.print("Velocidade Limite: " + Carro.velocidadeLimite);
        System.out.println();
        System.out.println("______________________");
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}

