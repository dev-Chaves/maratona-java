package academy.devdojo.maratonajava.excecoes.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.EmptyStackException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {

        try {


//            throw new EmptyStackException();

//            throw new ArrayIndexOutOfBoundsException();
//            throw new NullPointerException();

//            System.out.println("Dentro do Try");


        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Dentro do Catch 01");
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){

            System.out.println("Dentro do Catch 01");
            e.printStackTrace();

        }catch (NullPointerException e){

            System.out.println("Dentro do Catch 02");
            e.printStackTrace();


        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try {
            talvezLanceExcecao();
        }catch (SQLException | FileNotFoundException e){
            // Não pode haver exceções da mesma família na mesma linha.

            System.out.println("Dentro do sql exception");
            e.printStackTrace();
            System.out.println("Dentro do File exception");
            e.printStackTrace();
        }

        // As diferenças entre as duas, é que a primeira trata exceção de forma individual, na segunda, como todas exceções são filhas de Exception , as duas throws serão tratadas no e.printStrackTrace()

        try {

            talvezLanceExcecao();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void talvezLanceExcecao() throws SQLException, FileNotFoundException{

    }
}
