package academy.devdojo.maratonajava.Poo.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
