package academy.devdojo.maratonajava.Heranca.teste;

import academy.devdojo.maratonajava.Heranca.domain.Endereco;
import academy.devdojo.maratonajava.Heranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setCep("27313280");
        endereco.setRua("Rua A");

        Pessoa pessoa = new Pessoa();

        pessoa.setName("Sasuke");
        pessoa.setCpf("1112223310");
        pessoa.setEndereco(endereco);


    }
}
