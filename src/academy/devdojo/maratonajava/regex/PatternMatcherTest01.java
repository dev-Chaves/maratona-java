package academy.devdojo.maratonajava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        String regex = "aba";
        String text = "abaaaba";
        String text1 = "ababababa";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text1);

        System.out.println("texto:     "+text1);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas!");


        while(matcher.find()){
            System.out.println(matcher.start()+"");
        }

    }
}
