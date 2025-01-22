package academy.devdojo.maratonajava.PooCore.dominio;

import java.util.Arrays;

public class Funcionario {

    private String nome;
    private int idade;
    private double [] salarios;

    public void setIdade(int idade) {
        if (idade<0){
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double[] salarios) {
        if (salarios.length == 0){
            System.out.println("Adicione um salário");
            return;
        }
        this.salarios = salarios;
    }

    public void imprimiInfo(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Arrays.toString(this.salarios));
        imprimiMedia();
    }

    private void imprimiMedia(){
      double media = 0;

      for (double salario: salarios){
          media += salario;
      }

      media /= salarios.length;

        System.out.print("Média Salarial: "+ media);

    }

}
