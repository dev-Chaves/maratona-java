package academy.devdojo.maratonajava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class listTeste01 {
    public static void main(String[] args) {

        //<> Força a lista ter um tipo
        List<String> nomes = new ArrayList(4);//até a versão1.4

        nomes.add("chaves");
        nomes.add("baves");
        System.out.println(nomes.size());
        for(String names : nomes){
            System.out.println(names);
        }

        //tentando usar stream
        List<Integer> teste = new ArrayList<>();

        teste.add(1);
        teste.add(2);
        teste.add(3);

        // testar stream depois
    }
}
