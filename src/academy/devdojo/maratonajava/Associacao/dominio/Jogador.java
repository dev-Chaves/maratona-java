package academy.devdojo.maratonajava.Associacao.dominio;

public class Jogador {
    private String name;

    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprimi (){
        if (time != null){
            System.out.println(this.name);
            System.out.println(time.getName());
        } else System.out.println("Declare um Time!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
