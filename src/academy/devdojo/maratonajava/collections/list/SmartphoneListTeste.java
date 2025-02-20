package academy.devdojo.maratonajava.collections.list;

import academy.devdojo.maratonajava.collections.equals.domain.Celular;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste {
    public static void main(String[] args) {

        Celular celular = new Celular("C4", "Iphone");
        Celular celular1 = new Celular("C3", "Iphone");
        Celular celular4 = new Celular("C3", "Iphone");
        Celular celular2 = new Celular("C3", "Iphone");

        List<Object> teste = new ArrayList<>();

        teste.add(celular4);
        teste.add(celular1);
        teste.add(celular2);
        teste.add(celular);



        for (Object o : teste){
            System.out.println(o);
        }



    }
}
