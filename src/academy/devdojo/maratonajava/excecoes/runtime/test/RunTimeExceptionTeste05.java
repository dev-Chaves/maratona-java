package academy.devdojo.maratonajava.excecoes.runtime.test;

import academy.devdojo.maratonajava.excecoes.runtime.domain.Leitor01;
import academy.devdojo.maratonajava.excecoes.runtime.domain.Leitor02;

import java.io.*;

public class RunTimeExceptionTeste05 {
    public static void main(String[] args) {



    }

    public static void lerArquivos0(){
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void lerArquivos01(){

        // O java instância o objeto e incia ele, se encarregando de fazer o close();
        try ( Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void lerArquivos02(){

        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }

                // Se lá em cima disparada que não conseguiu ler um arquivo, aqui o reader seria nulo e dispararia uma exceção de NullPointerExcepetion

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }

}
