package academy.devdojo.maratonajava.Construtores.teste;

import academy.devdojo.maratonajava.Construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime("Naruto", "Ação", 777, "GIBI");

//        anime.init("HXH", "TV", 20);

        anime.imprimiInfo();

    }
}
