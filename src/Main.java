import java.time.*;
import java.util.*;

import static java.time.DayOfWeek.MONDAY;

public class Main {
    public static void main(String[] args) {
        System.out.println(next(MONDAY));
        System.out.println(format(LocalDate.of(2025, 11, 2)));
    }

    private static DayOfWeek next(DayOfWeek day) {
        int index = day.ordinal();
        index += 1;
        index = index % 7;
        return DayOfWeek.values()[index];
    }

    private static String format(LocalDate date) {
        return String.format(
                "%02d.%02d.%04d",
                date.getDayOfMonth(),
                date.getMonthValue(),
                date.getYear()
        );
    }
}
