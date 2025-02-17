package academy.devdojo.maratonajava.regex;

import com.sun.source.doctree.SinceTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {


        // \d = Todos os digitos
        String regex1 = "\\d";
        // \D todos que não forem digitos
        String regex2 = "\\D";
        // \S = Espaços em brancos = \t \n \f \r
        // Todos os caracteres excluindo os brancos/limpa os caracteres em branco.
        // \w todos as letras, todos os digitos e _

        String digitos = "jj312h3j12h";

        String regex = "aba";
        String text = "abaaaba";
        String text1 = "ababababa";

        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(digitos);

        System.out.println("texto:  "+digitos);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex1);
        System.out.println("Posições encontradas!");


        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
