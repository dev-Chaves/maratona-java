package academy.devdojo.maratonajava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {


        // \d = Todos os digitos
        String regex1 = "\\d";
        // \D todos que não forem digitos
        String regex2 = "\\D";
        // \S = Espaços em brancos = \t \n \f \r
        // Todos os caracteres excluindo os brancos/limpa os caracteres em branco.
        // \w todos as letras, todos os digitos e _

        String regex3 = "[abc]";

        String hexaValidos = "0[xX][0-9a-fA-F]";

        String numberHex = "0X59F86A 098e9sdsda OX231ff 1wnsajdbjk1 0x123";

        String digitos = "ajcj312ha3j12hb";

        String regex = "aba";
        String text = "abaaaba";
        String text1 = "ababababa";

        Pattern pattern = Pattern.compile(hexaValidos);

        Matcher matcher = pattern.matcher(numberHex);

        System.out.println("texto:  "+digitos);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex3);
        System.out.println("Posições encontradas!");


        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
