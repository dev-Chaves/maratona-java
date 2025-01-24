package academy.devdojo.maratonajava.Poo.dominio;

public class Calculadora {

    public void somaDoisNumero(int n,float n1){
        System.out.println(n+n1);
    }

    public float divideDoisNumeros(float n1, float n2){

        if (n1 != 0 || n2 != 0){
            return 0;
        }

        return n1/n2;
    }

    public void alterarNumeros (int n, int n1){
        n = 100;
        n1 = 101;
        System.out.println("Dentro do Alterar Números");
        System.out.println("N1"+n);
        System.out.println("N2"+n1);
    }

}
