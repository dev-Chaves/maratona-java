package acadademy.devdojo.maratonajava.introducao;

public class Aula03Operadores {
    public static void main (String[] args){
        int n1 = 10;
        int n2 = 10;
        int resultado = n1/n2;

        int idade = 30 ;
        float salario = 2000;


//        System.out.println(n1+n2);
//        System.out.println(resultado);

        boolean IsDentroDaLei = idade > 30 && salario >= 4512F;

//        System.out.print(IsDentroDaLei);

        double bonus = 1080;

        if (salario>3000) {
            System.out.println(salario + (double) bonus);
        }
        else if (salario<2000)
            System.out.println("Pobretão");

        else
            System.out.println("Se Fodeu!");
    }
}
