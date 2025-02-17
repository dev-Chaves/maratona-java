package academy.devdojo.maratonajava.datas.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {

        String pattern = "'Rio de Janeiro' dd 'de' MMMM 'de' yyyy";

        String patter1 = "EEE, d MMM yyyy HH:mm:ss Z";

        SimpleDateFormat sdf = new SimpleDateFormat(patter1);

        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);


        System.out.println(sdf.format(new Date()));

        System.out.println("====================================");

        System.out.println(sdf1.format(new Date()));

    }
}
