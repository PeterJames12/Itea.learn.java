package java8.date;

import jdk.nashorn.internal.ir.Terminal;

import javax.smartcardio.TerminalFactory;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Optional;

import static java.time.temporal.TemporalAdjusters.*;

/**
 * author Igor
 */
public class Date {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(localTime);

        Long time = Optional.of(time()).filter(s -> s % 2 == 0).orElse(Long.MAX_VALUE);

        System.out.println(time);

        LocalDateTime localDateTime = localTime.atDate(date);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = date.atTime(12, 12, 12, 12);
        System.out.println(localDateTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.YYYY");

        try {
            System.out.println("new date: " + formatter.format(date));
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("wrong format");
        }

        LocalTime localChangeTime = LocalTime.now();
        LocalTime changedTime = localChangeTime.minusHours(1);
        System.out.println(changedTime);

        LocalDate nextDayWeek = LocalDate.now();

        LocalDate friday = nextDayWeek.with(next(DayOfWeek.MONDAY));
        System.out.println(formatter.format(friday));

        ZoneId zoneKiev = ZoneId.of("Europe/Kiev");
        ZoneId zoneNewYork = ZoneId.of("America/New_York");

        ZonedDateTime kievTime = ZonedDateTime.of(LocalDateTime.now(), zoneKiev);
        System.out.println(kievTime);

        ZonedDateTime newYorkTime = kievTime.withZoneSameInstant(zoneNewYork);
        System.out.println(newYorkTime);
        System.out.println("New York: " + (newYorkTime.toLocalTime()));
        System.out.println("Kiev: " + kievTime.toLocalTime());

        LocalDate today = LocalDate.now();
        LocalDate myBirthday = LocalDate.of(1996, Month.AUGUST, 8);

        Period howOldI = Period.between(myBirthday, today);

        System.out.println(howOldI);

        long totalDays = ChronoUnit.DAYS.between(myBirthday, today);

        String oldMe = String.format("you are %s years, %s mounts, and %s days old (%s days total)", howOldI.getYears(),
                howOldI.getMonths(), howOldI.getDays(), totalDays);

        System.out.println(oldMe);
    }

    private static long time() {

        return System.currentTimeMillis();
    }
}
