package academy.devdojo.maratonajava.excecoes.runtime.test;

import java.util.EmptyStackException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {

        try {


            throw new EmptyStackException();

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

    }
}
