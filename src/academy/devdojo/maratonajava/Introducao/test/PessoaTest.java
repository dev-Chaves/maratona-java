package academy.devdojo.maratonajava.Introducao.test;

import academy.devdojo.maratonajava.Introducao.dominio.Estudante;

public class PessoaTest {
    public static void main(String[] args){

        Estudante estudante1 = new Estudante() ;

        estudante1.nome = "Chaves";

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);



    }
}
