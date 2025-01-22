package acadademy.devdojo.maratonajava.introducao;

public class Aula05ExercicioFor {
    public  static void main(String[] main) {

        int milhao = 1000000;

        for (int i=0; i<=milhao;i++) {
            if (i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
