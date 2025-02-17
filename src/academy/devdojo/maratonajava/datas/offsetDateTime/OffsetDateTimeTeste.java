package academy.devdojo.maratonajava.datas.offsetDateTime;

import java.time.OffsetDateTime;

public class OffsetDateTimeTeste {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.now();

        System.out.println(date.getMinute());

        System.out.println("-------------------------------------------------------------------");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        OffsetDateTime date1 = OffsetDateTime.now();

        System.out.println(date1.getMinute());

    }
}
