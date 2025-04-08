package academy.devdojo.maratonajava.IO.test;

import java.io.File;
import java.io.IOException;

public class IOTeste {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean delete = file.delete();

    }
}
