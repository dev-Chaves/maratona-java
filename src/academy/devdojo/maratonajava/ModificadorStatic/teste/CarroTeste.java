package academy.devdojo.maratonajava.ModificadorStatic.teste;

import academy.devdojo.maratonajava.ModificadorStatic.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){

        Carro carro1 = new Carro("Urus", 280);
        Carro carro2 = new Carro("Hellcat", 300);

//      carro1.setVelocidadeLimite(120);

        Carro.setVelocidadeLimite(180);

        carro1.imprimi();
        carro2.imprimi();

    }
}
