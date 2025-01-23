package academy.devdojo.maratonajava.construtores.teste;

import academy.devdojo.maratonajava.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime("Naruto", "Ação", 777, "GIBI");

//        anime.init("HXH", "TV", 20);

        anime.imprimiInfo();

    }
}
