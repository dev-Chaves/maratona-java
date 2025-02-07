package academy.devdojo.maratonajava.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando Dados de um arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Dados...");
    }
}
