package academy.devdojo.maratonajava.Associacao.teste;

import academy.devdojo.maratonajava.Associacao.dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Chaves");
        Jogador jogador2 = new Jogador("Pele");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for(Jogador jogador:jogadores){
            jogador.imprimi();
        }

        // Associação é a relação de objetos...

    }
}
