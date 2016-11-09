package datehandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class DateHandler {

    public String whatTimeIsIt(long secFromNoon) {
        LocalTime late = LocalTime.ofSecondOfDay(secFromNoon);
        return late.format(DateTimeFormatter.ISO_TIME);
    }

    public boolean isAfternoon(LocalDate day, long minFromNoon) {
        LocalDateTime dateTime = day.atStartOfDay().plusMinutes(minFromNoon);
        return dateTime.getHour() > 12;
    }
}
