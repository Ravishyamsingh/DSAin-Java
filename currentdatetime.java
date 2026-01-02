package Array_ArrayList;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class currentdatetime {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());

        LocalTime times=LocalTime.now();
        DateTimeFormatter tf=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(times.format(tf));
    }
}
