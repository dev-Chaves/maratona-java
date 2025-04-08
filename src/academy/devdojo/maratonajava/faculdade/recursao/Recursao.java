package academy.devdojo.maratonajava.faculdade.recursao;
public class Recursao {
    public static void main(String[] args) {
        RecursaoTeste recursaoTeste = new RecursaoTeste();

        int resultado = recursaoTeste.x(5);

    }
    public static class RecursaoTeste{

        public int x( int i) {
            if ( i <= 0) {
                System.out.println("Parou");
                return 0;
            }
            System.out.println("Executou " + i);
            System.out.println("Retornou " + (i - 1));
            return i+x(i - 1);
        }
    }
}
