package academy.devdojo.maratonajava.excecoes.runtime.test;

public class RunTimeExceptionTeste03 {
    public static void main(String[] args) {

        teste03();
    }

    private static void teste03() {
        try{
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");

//            var teste = new int[]{12};
//            System.out.println(teste[2]);

            System.out.println("Fechando o arquivo.");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
