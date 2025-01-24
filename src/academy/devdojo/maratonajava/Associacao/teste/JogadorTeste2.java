package academy.devdojo.maratonajava.Associacao.teste;

import academy.devdojo.maratonajava.Associacao.dominio.Jogador;
import academy.devdojo.maratonajava.Associacao.dominio.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time1 = new Time("Santos");

        jogador1.setTime(time1);

        jogador1.imprimi();
    }
}
