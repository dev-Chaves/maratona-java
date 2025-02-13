package academy.devdojo.maratonajava.excecoes.runtime.test;

import academy.devdojo.maratonajava.excecoes.runtime.domain.Funcionario;
import academy.devdojo.maratonajava.excecoes.runtime.domain.LoginInvalidoException;
import academy.devdojo.maratonajava.excecoes.runtime.domain.Pessoa;

public class Salvando {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new
                Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

        funcionario.salvar();


    }
}
