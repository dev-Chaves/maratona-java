package academy.devdojo.maratonajava.PooCore.sobrecargaMetodo.teste;

import academy.devdojo.maratonajava.PooCore.sobrecargaMetodo.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.init("HXH", "TV", 20);

        anime.imprimiInfo();

    }
}
