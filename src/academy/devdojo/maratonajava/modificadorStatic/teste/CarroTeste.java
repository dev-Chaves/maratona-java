package academy.devdojo.maratonajava.modificadorStatic.teste;

import academy.devdojo.maratonajava.modificadorStatic.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){

        Carro carro1 = new Carro("Urus", 280);
        Carro carro2 = new Carro("Hellcat", 300);

        carro1.setVelocidadeLimite(120);

        carro1.imprimi();
        carro2.imprimi();

    }
}
