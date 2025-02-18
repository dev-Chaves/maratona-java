package academy.devdojo.maratonajava.collections.equals.teste;

import academy.devdojo.maratonajava.collections.equals.domain.Celular;

public class equalsTeste {
    public static void main(String[] args) {

    String nome = "chaves";
    String name = new String("chaves");

    System.out.println(nome.equals(name));

    Celular celular1 = new Celular("ABC1", "samsug");
    Celular celular2 = celular1;

    // Em objeto, ele se refere pelo THIS.

    System.out.println(celular1.equals(celular2));

    }
}
