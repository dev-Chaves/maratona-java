package academy.devdojo.maratonajava.excecoes.runtime.test;

public class RunTimeExceptionTeste02 {
    public static void main(String[] args) {


        try {
            divisao(1, 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Passou!");

    }

    private static int divisao (int a, int b) throws IllegalArgumentException {

        if (b == 0){
            throw new IllegalArgumentException("Argumento Inválido!");
        }

        return a/b;
    }

}
