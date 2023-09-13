package Day7.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class dtExample {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        LocalDate dt = LocalDate.now();
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(dt.getMonth());

    }
}
