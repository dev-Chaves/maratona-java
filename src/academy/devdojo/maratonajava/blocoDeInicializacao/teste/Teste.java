package academy.devdojo.maratonajava.blocoDeInicializacao.teste;

import academy.devdojo.maratonajava.blocoDeInicializacao.dominio.Anime;

public class Teste {
    public static void main(String[] args){

        Anime anime = new Anime("Boruto");

        System.out.println(anime.getNome());

    }
}
