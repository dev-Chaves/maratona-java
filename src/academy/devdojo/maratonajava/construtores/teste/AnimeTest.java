package academy.devdojo.maratonajava.construtores.teste;

import academy.devdojo.maratonajava.PooCore.sobrecargaMetodo.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime("Naruto");

        anime.init("HXH", "TV", 20);

        anime.imprimiInfo();

    }
}
