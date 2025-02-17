package academy.devdojo.maratonajava.datas.localTime;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time.getSecond());

    }
}
