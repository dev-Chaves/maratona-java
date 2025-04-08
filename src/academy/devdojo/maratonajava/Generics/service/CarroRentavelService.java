package academy.devdojo.maratonajava.Generics.service;

import academy.devdojo.maratonajava.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {

    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro getCarroDisponiveis(){
        System.out.println("Buscando carro disponível...");

        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro: "+ carro);
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: "+ carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
    }


}
