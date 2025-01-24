package academy.devdojo.maratonajava.BlocoDeInicializacao.teste;

import academy.devdojo.maratonajava.BlocoDeInicializacao.dominio.Anime;

public class Teste {
    public static void main(String[] args){

        Anime anime = new Anime("Boruto");

        System.out.println(anime.getNome());

    }
}
