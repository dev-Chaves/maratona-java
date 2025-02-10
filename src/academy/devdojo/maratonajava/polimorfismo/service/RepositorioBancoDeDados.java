package academy.devdojo.maratonajava.polimorfismo.service;

import academy.devdojo.maratonajava.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um banco de dados");
    }

}
