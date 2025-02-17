package academy.devdojo.maratonajava.datas.localDate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class localDate {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");

        Locale localeJapao = new Locale("jag", "JP");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL,localeJapao);

        Calendar calendar = Calendar.getInstance();

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Japão: " + df2.format(calendar.getTime()));

    }
}
