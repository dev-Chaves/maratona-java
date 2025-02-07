package academy.devdojo.maratonajava.interfaces.teste;

import academy.devdojo.maratonajava.interfaces.domain.DataBaseLoader;
import academy.devdojo.maratonajava.interfaces.domain.FileLoader;

import java.util.Collection;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();


        fileLoader.load();

        dataBaseLoader.load();

        dataBaseLoader.remove();

        fileLoader.remove();


    }


}
