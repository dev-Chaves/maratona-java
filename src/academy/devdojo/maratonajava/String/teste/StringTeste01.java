package academy.devdojo.maratonajava.String.teste;

public class StringTeste01 {
    public static void main(String[] args) {

        String name = "joao";
        String name1 = "chaves";

        name.concat(name1);

        System.out.println(name);

        String name3 = new String("chaves");

        System.out.println(name == name1);

        // Não apontam pro mesmo objeto de referência.

        System.out.println(name1 == name3);

        System.out.println(name1 == name3.intern());

    }
}
