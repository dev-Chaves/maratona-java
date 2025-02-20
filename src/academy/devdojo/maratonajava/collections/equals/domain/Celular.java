package academy.devdojo.maratonajava.collections.equals.domain;

public class Celular {
    String serie;
    String nome;

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if (this == obj)  return false;
        if (this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serie != null && serie.equals(celular.serie);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "serie='" + serie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Celular(String serie, String nome) {
        this.serie = serie;
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


