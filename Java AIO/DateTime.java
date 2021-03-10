// A jshell workspace file
import java.util.*;
import java.time.*;
import java.time.temporal.*;

for (String id : ZoneId.getAvailableZoneIds())
System.out.println(id);
ZonedDateTime zdate;
zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0,
z);
zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0,
ZoneId.of("America/Los_Angeles"));
ZoneOffset z = ZoneOffset.of("-08:00");
OffsetTime time = OffsetTime.of(10, 30, 0, 0,
ZoneOffset.ofHours(-8));
int year = date.getYear();
int month = date.getMonthValue();
int day = date.getDayOfMonth();
LocalDate date = LocalDate.parse("2020-06-30");
System.out.println(date.getDayOfYear());
System.out.println(date.getDayOfWeek());
System.out.println(date.lengthOfMonth());
System.out.println(date.lengthOfYear());
if (LocalDate.now().isEqual(LocalDate.now()))
    System.out.println("All is right in the universe.");

System.out.println("Today: " + LocalDate.now());
System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
System.out.println("Next week: " + LocalDate.now().plusWeeks(1));
System.out.println("Next month: " + LocalDate.now().plusMonths(1));
System.out.println("Next month: " + LocalDate.now().plusYears(1));

LocalDate date1 = LocalDate.parse("2014-05-16");
LocalDate date2 = LocalDate.parse("2014-12-15");
System.out.println(date1.until(date2.ChronoUnit.DAYS));

LocalDate today = LocalDate.now();
LocalDate invDate = LocalDate.of(today.getYear(), today.getMonthValue(), 15);
if (today.getDayOfMonth() > 15)
    invDate = invDate.plusMonths(1);
long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
System.out.println(daysToInvoice
+ " until next invoice date.");