package academy.devdojo.maratonajava.datas.calendarTeste;

import java.util.Calendar;
import java.util.Date;

public class calendarTeste01 {
    public static void main(String[] args) {

        // é um função abstrata e não permite o instanciamento
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();

        System.out.println(c);

        System.out.println("---------------------------------------------------");

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        System.out.println("---------------------------------------------------");

        System.out.println(date);

    }
}
