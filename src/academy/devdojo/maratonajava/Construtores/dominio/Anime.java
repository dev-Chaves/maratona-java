package academy.devdojo.maratonajava.Construtores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, int episodios, String estudio) {
        this(nome, tipo, episodios);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Construtor criado!");
    };


//    public void init(String nome, String tipo, int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimiInfo(){
        System.out.print("Nome: "+this.nome);
        System.out.println();
        System.out.print("Tipo: "+this.tipo);
        System.out.println();
        System.out.println("Episódios: "+this.episodios);
    }
}