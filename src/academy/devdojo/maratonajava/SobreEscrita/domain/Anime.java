package academy.devdojo.maratonajava.SobreEscrita.domain;

public class Anime extends Object{
    private String name;

    @Override
    public String toString(){
        return "Anime "+ this.name;
    }

    public Anime(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprimi () {
        System.out.println(this.name);
    }

}
