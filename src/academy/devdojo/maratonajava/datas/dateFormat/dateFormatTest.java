package academy.devdojo.maratonajava.datas.dateFormat;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.Calendar;

public class dateFormatTest {
    public static void main(String[] args) {

        Calendar caledar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getTimeInstance(DateFormat.SHORT);
        df[4] = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);


        for (DateFormat date : df) {

            System.out.println(date.format(caledar.getTime()));
            System.out.println("______________________________________");

        }


    }
}
