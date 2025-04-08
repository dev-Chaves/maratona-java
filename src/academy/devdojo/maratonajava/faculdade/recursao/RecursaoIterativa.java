package academy.devdojo.maratonajava.faculdade.recursao;

public class RecursaoIterativa {
    public static void main(String[] args) {
        int resultado = recursaoIterativa(5);
        System.out.println("Resultado: " + resultado);
    }

    public static int recursaoIterativa(int i) {
        int resultado = 0;
        for (int j = i; j > 0; j--) {
            System.out.println("Executou " + j);
            resultado += j;
        }
        return resultado;
    }
}