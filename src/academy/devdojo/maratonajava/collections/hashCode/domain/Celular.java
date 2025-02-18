package academy.devdojo.maratonajava.collections.hashCode.domain;

public class Celular {
    String serie;
    String nome;

    @Override
    public int hashCode() {
        //if (this.serie == null)return 1;

        return serie == null ? 0 : this.serie.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if (this == obj)  return false;
        if (this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serie != null && serie.equals(celular.serie);
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


