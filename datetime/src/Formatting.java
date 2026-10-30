import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatting {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.parse("2022-09-19");
        LocalDateTime data02 = LocalDateTime.parse("2022-09-18T18:09:20");
        Instant data03 = Instant.parse("2022-07-20T01:50:06Z");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatter05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Data 01: " + data01.format(formatter1));
        System.out.println("Data 01: " + formatter1.format(data01));
        System.out.println("Data 02: " + data02.format(formatter02));
        System.out.println("Data 02: " + data02.format(formatter04));
        System.out.println("Data 03: " + formatter03.format(data03));
        System.out.println("Data 03: " + formatter05.format(data03));
    }
}