package academy.devdojo.maratonajava.PooCore.teste;

import academy.devdojo.maratonajava.PooCore.dominio.Funcionario;

public class FuncionarioTeste {
    public static void
    main(String[] args){

        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Chaves");
        funcionario01.setIdade(19);
        funcionario01.setSalario(new double[]{1999, 2999, 1000});

        funcionario01.imprimiInfo();

    }
}
