package academy.devdojo.maratonajava.blocoDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episdodios;
    {

    }

     public Anime(String nome ){
         episdodios = new int[900];
         System.out.println(episdodios);

         for (int i=0; i<episdodios.length;i++){
             episdodios[i] = i+1;
         };

         for (int ep:episdodios){
             System.out.print("episódios: "+ep);
             System.out.println();
         }
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisdodios() {
        return episdodios;
    }

    public void setEpisdodios(int[] episdodios) {
        this.episdodios = episdodios;
    }
}
