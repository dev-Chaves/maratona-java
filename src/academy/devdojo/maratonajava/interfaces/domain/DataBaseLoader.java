package academy.devdojo.maratonajava.interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void remove() {
        System.out.println("Deletando Dados...");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }

}
