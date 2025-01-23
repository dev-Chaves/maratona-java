package academy.devdojo.maratonajava.construtores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios (int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void imprimiInfo(){
        System.out.print("Nome: "+this.nome);
        System.out.println();
        System.out.print("Tipo: "+this.tipo);
        System.out.println();
        System.out.println("Episódios: "+this.episodios);
    }
}