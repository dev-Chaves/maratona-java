package academy.devdojo.maratonajava.PooCore.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
