package academy.devdojo.maratonajava.excecoes.runtime.test;

public class RunTimeExcepetionTeste02 {
    public static void main(String[] args) {

        System.out.println(divisao(1, 0));

    }

    private static int divisao (int a, int b){

        if (b == 0){
            throw new IllegalArgumentException("Argumento Inválido!");
        }

        try {
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        return 0;

    }

}
