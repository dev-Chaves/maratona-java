package academy.devdojo.maratonajava.Introducao.test.carrosT;

import academy.devdojo.maratonajava.Introducao.dominio.carrosD.Carros;

public class carroTeste {
    public static void main(String[] args){

        Carros carro1 = new Carros();

        carro1.nome = "Voyagem";
        carro1.modelo = "Cedan";
        carro1.ano = 2025;

        Carros carro2 = new Carros();

        carro2.nome = "Gol";
        carro2.modelo = "Slim";
        carro2.ano = 2024;

    }
}
