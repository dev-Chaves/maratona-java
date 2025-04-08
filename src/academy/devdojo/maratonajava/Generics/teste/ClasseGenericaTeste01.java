package academy.devdojo.maratonajava.Generics.teste;

import academy.devdojo.maratonajava.Generics.dominio.Carro;
import academy.devdojo.maratonajava.Generics.service.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.getCarroDisponiveis();

        System.out.println("Usando carro por um mês");

        carroRentavelService.retornarCarroAlugado(carro);

    }
}
