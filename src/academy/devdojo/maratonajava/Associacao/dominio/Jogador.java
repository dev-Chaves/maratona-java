package academy.devdojo.maratonajava.Associacao.dominio;

public class Jogador {
    private String name;

    private String time;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprimi (){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
