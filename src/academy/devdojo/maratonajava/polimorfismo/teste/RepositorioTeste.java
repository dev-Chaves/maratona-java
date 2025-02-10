package academy.devdojo.maratonajava.polimorfismo.teste;

import academy.devdojo.maratonajava.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.polimorfismo.service.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.polimorfismo.service.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();

        repositorio.salvar();

    }
}
