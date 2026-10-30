package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiation {
    public static void main(String[] args) {
        // Instanciação
        LocalDate data01 = LocalDate.now();
        System.out.println("Data 01: " + data01);

        LocalDateTime data02 = LocalDateTime.now();
        System.out.println("Data 02: " + data02);

        Instant data03 = Instant.now();
        System.out.println("Data 03: " + data03);

        LocalDate data04 = LocalDate.parse("2022-09-19");
        System.out.println("Data 04: " + data04);

        LocalDateTime data05 = LocalDateTime.parse("2026-03-01T20:09:10");
        System.out.println("Data 05: " + data05);

        Instant data06 = Instant.parse("2026-03-01T20:09:10Z");
        System.out.println("Data 06: " + data06);

        Instant data07 = Instant.parse("2026-03-01T20:09:10-03:00");
        System.out.println("Data 07: " + data07);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data08 = LocalDate.parse("20/07/2026", formatter1);
        System.out.println("Data 08: " + data08);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data09 = LocalDateTime.parse("01/01/2020 01:57", formatter2);
        System.out.println("Data 09: " + data09);

        LocalDate data10 = LocalDate.of(2024, 9, 7);
        System.out.println("Data 10: " + data10);

        LocalDateTime data11 = LocalDateTime.of(2022, 7, 20, 1, 59);
        System.out.println("Data 11: " + data11);
    }
}