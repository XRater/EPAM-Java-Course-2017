package ClassWork.p100717;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class TimeExamples {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        Date time = Calendar.getInstance().getTime();
        System.out.println(time);

        System.out.println(LocalTime.now());
        LocalDate now = LocalDate.now();
        System.out.println(LocalDateTime.now());

        LocalDate birthday = LocalDate.of(2017, 12, 17);

        System.out.println(birthday);

        System.out.println(birthday.compareTo(now));
    }

}
